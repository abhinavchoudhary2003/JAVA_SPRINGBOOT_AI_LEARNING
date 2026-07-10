package com.cfs.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

/*
We need this complete code because it acts as the visual dashboard of your application, fetching the student data saved in the server's memory  and transforming it into a clean, dynamic HTML table that a user can actually see and read in their web browser.
 Without this doGet servlet, you could save thousands of students using your registration form, but they would remain trapped inside the server's backend memory with no way for a user to ever view them on their screen.
 */

@WebServlet("/students")
public class StudentListServlet extends HttpServlet {
    private static final String KEY = "STD_LIST";

   // key identifier used to retrieve the student data list from the ServletContext
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, IOException {

        //  Inform the browser(client) that the response body contains an HTML webpage
        resp.setContentType("text/html");

        // 2. Data Retrieval: Pull the shared application list using the helper function below
        List<Student> list = getList();

        // 3. Output Stream Setup: Open the character printing pipeline straight to the client browser
        PrintWriter out = resp.getWriter();

        // 4. Document Framework: Open standard boilerplate HTML and Body layout tags
        out.println("<html><body>");

        // 5. Roster Header: Compute and print the current live size count of the list dynamically
        out.println("<h2>All Students (" + list.size() + ")</h2>");

        // 6. Navigation Link: Render an HTML anchor link redirecting back to the registration input form
        out.println("<a href='index.html'>+ Add Students </a> </br></br>");

        // 7. Table Setup: Open a structured table grid with custom spacing, cell padding, and borders
        out.println("<table border='1' cellpadding='7' cellspacing='0' >");

        // 8. Table Headers: Render the core descriptive field category titles across the first row
        out.println("<tr><th>#</th><th>Name</th><th>Roll</th><th>Course</th><th>Marks</th></tr>");

        // 9. Iterative Generation Loop: Loop through every Student instance stored inside our application list
        int i = 1;
        for (Student s : list) {
            out.println("<tr>"); // Open a clean, separate row for the current student loop item


            out.println("<td>" + (i++) + "</td>");
            out.println("<td>" + s.getName() + "</td>");
            out.println("<td>" + s.getRoll() + "</td>");
            out.println("<td>" + s.getCourse() + "</td>");
            out.println("<td>" + s.getMarks() + "</td>");

            out.println("</tr>"); // Close out the row item data entry block
        }


        out.println("</table>");
        out.println("</body></html>");
    }

    private List<Student> getList() {
        // Access the global, application-wide context container

        // This servlet Context is for read or display data
        ServletContext ctx = getServletContext();

        // Attempt to parse out the targeted student registration list data
        List<Student> list = (List<Student>) ctx.getAttribute(KEY);

        // Defensive Check: If context holds absolutely nothing, return a blank list structure instead of 'null' to prevent a crash
        return (list == null) ? Collections.emptyList() : list;
    }
}
