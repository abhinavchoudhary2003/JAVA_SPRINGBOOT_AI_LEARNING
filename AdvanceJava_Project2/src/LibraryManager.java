import java.sql.*;
import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args) {

    try{
    Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(DbConfig.url,DbConfig.username,DbConfig.password);
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\n=== LIBRARY MANAGEMENT SYSTEM ====");
            System.out.println("1. Add Book");
            System.out.println("2. Update Quantity");
            System.out.println("3. Delete Book");
            System.out.println("4. Search Book");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1: // Add a Book
                    System.out.println("Enter book id:");
                    int bookid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter book title:");
                    String title = sc.nextLine();
                    System.out.println("Enter book Author");
                    String author = sc.nextLine();
                    System.out.println("Enter Quantity:");
                    int quantity = sc.nextInt();


                        try(PreparedStatement ps = connection.prepareStatement("Insert into book values(?,?,?,?)")){
                             ps.setInt(1,bookid);
                             ps.setString(2,title);
                             ps.setString(3,author);
                             ps.setInt(4,quantity);

                             int rows = ps.executeUpdate();
                            System.out.println(rows + " Book Added.");

                        }
                        break;
                case 2: // Update Quantity
                    System.out.println("Enter book id to update:");
                    int idToUpdate = sc.nextInt();
                    System.out.println("Enter new quantity:");
                    int newQty = sc.nextInt();

                    try(PreparedStatement ps1 = connection.prepareStatement("update book set quantity =? where bookid=?")){
                        ps1.setInt(1, newQty);
                        ps1.setInt(2, idToUpdate);

                        int updated = ps1.executeUpdate();
                        if (updated > 0) {
                            System.out.println("Quantity updated.");
                        } else {
                            System.out.println("Book id not found.");
                        }
                    }
                    break;
                case 3: // Delete Book
                    System.out.println("Enter book id to delete:");
                    int idToDelete = sc.nextInt();

                    try (PreparedStatement ps2 = connection.prepareStatement(
                            "delete from book where bookid=?")) {
                        ps2.setInt(1, idToDelete);

                        int deleted = ps2.executeUpdate();
                        if (deleted > 0) {
                            System.out.println("Book deleted.");
                        } else {
                            System.out.println("Book id not found.");
                        }
                    }
                    break;
                case 4: // search a book
                    System.out.println("Enter book id to search:");
                    int bookidToSearch = sc.nextInt();

                    try (PreparedStatement ps3 = connection.prepareStatement(
                            "select * from book where bookid=?")) {
                        ps3.setInt(1, bookidToSearch);

                        try (ResultSet rs = ps3.executeQuery()) {
                            if (rs.next()) {
                                System.out.println("Book found: "
                                        + rs.getInt("bookid") + " | "
                                        + rs.getString("title") + " | "
                                        + rs.getString("author") + " | "
                                        + rs.getInt("quantity"));
                            } else {
                                System.out.println("Book not found.");
                            }
                        }
                    }
                    break;
                case 5: // Issue Book
                    System.out.println("Enter book id to issue:");
                    int bookidToIssue = sc.nextInt();

                    try (PreparedStatement ps4 = connection.prepareStatement(
                            "select quantity from book where bookid=?")) {
                        ps4.setInt(1, bookidToIssue);

                        try (ResultSet rs2 = ps4.executeQuery()) {
                            if (rs2.next()) {
                                int currentQty = rs2.getInt("quantity");
                                if (currentQty > 0) {
                                    try (PreparedStatement ps5 = connection.prepareStatement(
                                            "update book set quantity = quantity - 1, issued_count = issued_count + 1 where bookid=?")) {
                                        ps5.setInt(1,bookidToIssue);
                                        ps5.executeUpdate();
                                        System.out.println("Book issued successfully.");
                                    }
                                } else {
                                    System.out.println("Book not available (quantity is 0).");
                                }
                            } else {
                                System.out.println("Book id not found.");
                            }
                        }
                    }
                    break;
                case 6: // Return Book
                    System.out.println("Enter book id to return:");
                    int bookidToReturn = sc.nextInt();

                    try (PreparedStatement ps6 = connection.prepareStatement(
                            "select issued_count from book where bookid=?")) {
                        ps6.setInt(1, bookidToReturn);

                        try (ResultSet rs3 = ps6.executeQuery()) {
                            if (rs3.next()) {
                                int currentlyIssued = rs3.getInt("issued_count");
                                if (currentlyIssued > 0) {
                                    try (PreparedStatement ps7 = connection.prepareStatement(
                                            "update book set quantity = quantity + 1, issued_count = issued_count - 1 where bookid=?")) {
                                        ps7.setInt(1, bookidToReturn);
                                        ps7.executeUpdate();
                                        System.out.println("Book returned successfully.");
                                    }
                                } else {
                                    System.out.println("No copies of this book are currently issued — cannot return.");
                                }
                            } else {
                                System.out.println("Book id not found.");
                            }
                        }
                    }
                    break;

                case 7: // Exit
                    System.out.println("Exiting.....");
                    connection.close(); // close only once, when exiting
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
    } catch (SQLException e){
        System.out.println("Database error: " + e.getMessage());
    }
    catch (Exception e) {
        e.printStackTrace();
    }
    }
}
