import  java.sql.*;
public class UpdateDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "24232111"
            );
            Statement stmt = con.createStatement();
            String sql="UPDATE employee SET empname = 'karan' WHERE empid=4";
            int res = stmt.executeUpdate(sql);

            if(res>0)
            {
                System.out.println("Update successful! Name changed");
            }
            else {
                System.out.println("Update Failed");
            }

            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
