package com.cfs.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Maps this Servlet to the URL endpoint '/reg'
@WebServlet("/reg") // Because of this now we don't need to write deployment description of servlet in   web.xml
public class StudentRegServlet  extends HttpServlet {

    // Unique key identifier used to store and retrieve the list from ServletContext
    private static final String KEY = "STD_LIST";

    // Handles incoming HTTP POST requests (triggered when a user submits a form)
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        //Extract raw String parameters sent from the HTML form 'name' attributes
        String name = req.getParameter("name");
        String roll = req.getParameter("roll");
        String course = req.getParameter("course");
        String marksStr = req.getParameter("marks");


      //  Validation: If marks input is null or empty, default to 0; otherwise parse to an integer
        int marks = (marksStr == null || marksStr.isEmpty()) ? 0 : Integer.parseInt(marksStr);


      // Student object using the extracted data
       Student student = new Student(name, roll, course, marks);

        List<Student> list = getOrCreateList();
        list.add(student);

        // 6. Redirect the user's browser to the '/students' servlet page to view the updated roster
        res.sendRedirect("students");
    }

    // Helper method to safely fetch or initialize the globally shared student list.
    private List<Student> getOrCreateList() {

       // this servlet context  is used to store student's data that we add during the form submission
        // 1. Access the ServletContext (Global Application Scope shared by all users and servlets)
        ServletContext ctx = getServletContext();

        // 2. Lock the ServletContext object
        synchronized (ctx) {

            // 3. Attempt to fetch the existing list using our constant KEY
            List<Student> list = (List<Student>) ctx.getAttribute(KEY);

            // 4. Double-Check Lock: If the list doesn't exist yet, build a thread-safe instance
            if (list == null) {

                // Wrap a standard ArrayList into a synchronized list to prevent simultaneous data corruption
                list = Collections.synchronizedList(new ArrayList<>());

                // Save the newly created thread-safe list back into the application context
                ctx.setAttribute(KEY, list);
            }

            // 5. Return the shared list instance
            return list;
        }
    }
}
