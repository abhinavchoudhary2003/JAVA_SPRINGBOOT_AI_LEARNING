import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstApp  extends GenericServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("Int() method called......");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        // Servlet building the HTTP Response Header
     //   This line writes a message to the client's browser saying: "Hey Browser, I am sending you an HTML webpage. Get ready to style it."
     res.setContentType("text/html");

      // res.getWriter() creates a new printing tool named out. This tool bypasses your local console and connects directly to the network pipe leading back to the client's browser.
        PrintWriter out = res.getWriter();

        //The Client Side: The client's browser receives this text, reads the <h1> tags, and displays a big, bold heading on the user's screen:
        out.println("<h1>Hello Dynamic Buddy.</h1>");
    }
    @Override
    public void destroy() {
        System.out.println("destroy() method called......");
    }
}
