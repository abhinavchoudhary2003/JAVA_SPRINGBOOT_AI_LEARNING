import java.sql.*;
import java.util.Scanner;

// Student Management System
public class StudentManager {
    public static void main(String[] args) {
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // open a connection - stays open for the entire program, closes only on Exit
            Connection connection = DriverManager.getConnection(DbConfig.url, DbConfig.username, DbConfig.password);
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\n=== STUDENT MANAGEMENT SYSTEM ====");
                System.out.println("1. Insert Student");
                System.out.println("2. Update Marks");
                System.out.println("3. Delete Student");
                System.out.println("4. Search Student");
                System.out.println("5. Exit");
                System.out.println("Enter your choice: ");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1: // Insert Students
                        System.out.println("Enter the roll no:");
                        int rollNo = sc.nextInt();
                        System.out.println("Enter name:");
                        String name = sc.next();
                        System.out.println("Enter the marks");
                        double marks = sc.nextDouble();

                        try (PreparedStatement ps = connection.prepareStatement(
                                "insert into student values(?,?,?)")) {
                            ps.setInt(1, rollNo);
                            ps.setString(2, name);
                            ps.setDouble(3, marks);

                            int rows = ps.executeUpdate();
                            System.out.println(rows + " record inserted.");
                        }
                        break;

                    case 2: // Update marks of particular rollNo
                        System.out.println("Enter roll no to update");
                        int roll = sc.nextInt();
                        System.out.println("Enter new marks:");
                        double newMarks = sc.nextDouble();

                        try (PreparedStatement ps1 = connection.prepareStatement(
                                "update student set marks=? where rollno=?")) {
                            ps1.setDouble(1, newMarks);
                            ps1.setInt(2, roll);

                            int updated = ps1.executeUpdate();
                            if (updated > 0) {
                                System.out.println("Record updated.");
                            } else {
                                System.out.println("Roll number not found.");
                            }
                        }
                        break;

                    case 3: // Delete Student according to roll no
                        System.out.println("Enter the roll num to delete:");
                        int rn = sc.nextInt();

                        try (PreparedStatement ps2 = connection.prepareStatement(
                                "delete from student where rollno=?")) {
                            ps2.setInt(1, rn);

                            int u = ps2.executeUpdate();
                            if (u > 0) {
                                System.out.println("Record deleted.");
                            } else {
                                System.out.println("Roll number not found.");
                            }
                        }
                        break;

                    case 4: // Search Student
                        System.out.println("Enter the roll to search:");
                        int rSearch = sc.nextInt();

                        try (PreparedStatement ps3 = connection.prepareStatement(
                                "select * from student where rollno=?")) {
                            ps3.setInt(1, rSearch);

                            try (ResultSet rs = ps3.executeQuery()) {
                                if (rs.next()) {
                                    System.out.println("Data found: " + rs.getInt(1) + " | "
                                            + rs.getString(2) + " | " + rs.getDouble(3));
                                } else {
                                    System.out.println("Student not found.");
                                }
                            }
                        }
                        break;

                    case 5: // Exit
                        System.out.println("Exiting.....");
                        connection.close(); // close only once, when exiting
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
                // connection.close() removed from here — was closing after every operation
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


// why we need to write prepared statement inside try if it is working fine without it  ?
/*
Why It "Works Fine" Without Closing
Each time you run a case, you create a new PreparedStatement (ps, ps1, etc.) — the old one from the previous loop iteration just gets abandoned, not actively destroyed. Java's garbage collector might eventually clean up the Java-side object, but that's not the real problem.

The Real Problem — It's Not About Java Memory, It's About Database-Side Resources
When you create a PreparedStatement or ResultSet, the database server (MySQL) also allocates resources on its side — things like:
Cursors (for ResultSet — tracking your position in the result rows).
Server-side memory buffers holding the prepared query and any partial results.
Sometimes, locks on rows/tables, depending on the query and transaction settings.
These are not cleaned up automatically just because your Java variable goes out of scope. They stay allocated on the MySQL server until you explicitly close them, or until the Connection itself closes.

Where It Actually Bites You?
Imagine this same code running as part of a real application that stays alive for hours or days — say, a backend service handling many requests, or even just you running this menu loop 500 times in one sitting without restarting:
Each unclosed PreparedStatement/ResultSet keeps consuming a small amount of memory on the MySQL server, not just in your Java program.
MySQL (and most databases) have a limit on how many open cursors/statements a single connection can have at once.
Eventually, you'll hit that limit and start getting errors like:
oo many open statements/cursors on this connection
Or your MySQL server's memory usage gradually climbs over time — a classic resource leak — until performance degrades or the server refuses new connections.
 */

