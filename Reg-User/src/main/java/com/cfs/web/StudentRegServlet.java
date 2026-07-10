package com.cfs.web;



import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

// Create a Servlet
public class StudentRegServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    // the client's browser wouldn't know whether the incoming data was plain text, a downloadable file, or a piece of code.
    // By calling res.setContentType("text/html");, your backend instructs the client: "This data contains HTML tags, so execute your rendering engine and display this visually to the user."
    res.setContentType("text/html");


     // When the user clicks submit, the browser packages the HTTP request body like this: username=Abhinav&rollno=101&course=CS&marks=95.

     //   This tells the server to look inside the incoming HTTP request for a data field sent by the client with the name attribute "username","rollno","course"."marks"
        String name = req.getParameter("username"); // here we enter id of username label
        String rollno = req.getParameter("rollno");
        String course = req.getParameter("course");
        int marks = Integer.parseInt(req.getParameter("marks"));

         // Instantiating your Student object
        Student s=new Student(name,rollno,course,marks);

        System.out.println(s);

    }
}
