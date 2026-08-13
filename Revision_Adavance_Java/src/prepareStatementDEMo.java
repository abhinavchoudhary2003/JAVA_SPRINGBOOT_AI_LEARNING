import java.sql.*;
import java.util.Scanner;

public class prepareStatementDEMo {
    public static void main(String[] args) {
        try {
          //open a connection
            Connection connection = DriverManager.getConnection(DbConfig.url, DbConfig.username, DbConfig.password);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id :");
            int id=sc.nextInt();

            System.out.println("Enter name : ");
            String name=sc.next();
            sc.nextLine();

            System.out.println("Enter salary: ");
            int salary = sc.nextInt();

            // Create a statement
            PreparedStatement statement = connection.prepareStatement("Insert into employee values(?,?,?)");
             statement.setInt(1,id);
             statement.setString(2,name);
             statement.setInt(3,salary);

             // execute a query
            int res = statement.executeUpdate();
            System.out.println(res+" row inserted successfully!");

            // close the query
            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
