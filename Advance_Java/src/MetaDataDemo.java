import java.sql.*;

public class MetaDataDemo {
    public static void main(String[] args) {
        try{
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // get a connection
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "24232111"
            );

            //===================================================
            //part-1 DatabaseMetaData (info about the software)
            //===================================================
            DatabaseMetaData metaDb = con.getMetaData();
            System.out.println("=== Database info ====");
            System.out.println("Driver name:  "+metaDb.getDriverName());
            System.out.println("Driver version:  "+metaDb.getDriverVersion());
            System.out.println("Logged in user:  "+metaDb.getUserName());
            System.out.println("Database URL:  "+metaDb.getURL());

            //===================================================
            //part-2 ResultMetaData (info about the java application software)
            //===================================================

            Statement stmt = con.createStatement(); // create a statement
            ResultSet rs = stmt.executeQuery("SELECT * from employee"); // ResultSet
            ResultSetMetaData rsmd = rs.getMetaData();

            //1. How many columns are in this table ?
            int totalColumn = rsmd.getColumnCount();
            System.out.println("Total column: "+totalColumn);

            //2. What are the names and types of columns ?
            System.out.println("--------------------------------------------");
            System.out.println("Col Index  | Column Name  | Column Type");
            System.out.println("--------------------------------------------");

            //loop from 1 to total column
            for (int i=1;i<=totalColumn;i++)
            {
                System.out.println(
                        "  "+i+"    |  "+rsmd.getColumnName(i)+" |  "+
                                rsmd.getColumnTypeName(i)
                );
            }
            System.out.println("----------------------------------------------");
            con.close(); // connection close

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
