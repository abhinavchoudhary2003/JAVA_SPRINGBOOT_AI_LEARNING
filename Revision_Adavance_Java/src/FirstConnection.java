import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FirstConnection {
    public static void main(String[] args) {
        try{
        // load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // open a connection
            Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/practicedb",
            "root",
            "24232111"
            );

        // Create a statement
            Statement statement = connection.createStatement();
        // executeQuery
            ResultSet resultSet = statement.executeQuery("Select * from employee");
                while(resultSet.next()){
                    System.out.println(resultSet.getInt("id")+" "+resultSet.getString("name"));
                }


        connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
