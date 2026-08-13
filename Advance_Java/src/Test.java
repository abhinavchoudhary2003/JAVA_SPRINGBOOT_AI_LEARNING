import java.sql.*;

public class Test {
    public static void main(String[] args) {
        //load driver
        //get connection
        //create statement
        //execute query
        //close conn
        try {
            //load driver means Load the MySQL driver class so it registers itself with DriverManager, making it available to translate JDBC calls later.
            Class.forName("com.mysql.cj.jdbc.Driver");

            //get connection -  DriverManager picks the MySQL driver, which opens and authenticates a connection to the MySQL server
            Connection connection= DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb", // We need this to tell the MySQL driver exactly WHERE the database server is (host + port + database name)
            "root",  // and WHO is trying to connect (username + password), so it can open an authenticated connection
             "24232111"
            );

            //create statement   which is used to communicate with the database
            // In technical terms,Create a Statement to send SQL commands to the database over that connection. At this point, no SQL has been sent yet — it's just preparing the mechanism to send it.
            Statement statement=connection.createStatement();

            // send the SQL query and get results back from the database
            // technically: driver translates SQL to MySQL's protocol format, sends it to the server,
            // MySQL runs it, and results come back as a ResultSet (cursor over the rows)
            // this is the exact line where Java code gets translated into MySQL-understandable language
            ResultSet resultSet=statement.executeQuery("select * from employee");
            //boolean execute = statement.execute("select * from employee");
            while (resultSet.next()) 
            {
                System.out.println(resultSet.getInt("empid")
                        +"  "+resultSet.getString("empname"));
            }
            // close the connection
            // closes the network connection to the MySQL server; in most JDBC drivers(including MySQL's) this also closes the Statement and ResultSet automatically
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
