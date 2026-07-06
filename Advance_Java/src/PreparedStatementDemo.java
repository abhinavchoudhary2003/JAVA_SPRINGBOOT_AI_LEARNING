import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        try{
        Connection con = DriverManager.getConnection(DbConfig.url,DbConfig.username,DbConfig.password);
            Scanner sc= new Scanner(System.in);

            System.out.println("Enter id :");
            int id=sc.nextInt();

            System.out.println("Enter name : ");
            String name=sc.next();


            String query ="insert into employee values (?,?)"; // query plan not execution of query
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1,id);
            ps.setString(2,name);

            int res = ps.executeUpdate();
            System.out.println(res+" row inserted successfully!");

            con.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
