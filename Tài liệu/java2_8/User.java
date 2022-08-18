import java.sql.*;
import java.util.Scanner;


public class User {
    Scanner scanner = new Scanner(System.in);


    //book

    public void SelectBook(){
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
        ){

            System.out.println("============================================================================");
            String strSelect = "select * from books";
            System.out.println("The SQL statement is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are: ");

            while (rset.next()){
                int id = rset.getInt("id");
                String bookname = rset.getString("bookname");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(id + ", " + bookname + ", " + price + ", " + qty);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public void InsertBook(Book book){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");
                //Step2
                Statement stmt = conn.createStatement();
        ){
            String sqlInsert = "insert into books (bookname,price,qty) values (" + " '" + book.getName() + "', "  + book.getPrice() + ", "  + book.getQty()+")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void DeleteBook(int id){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");

                Statement stmt = conn.createStatement();
        ){
            String sqlDelete = "DELETE FROM books WHERE id = " + id;
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void UpdateBook( int id, double price , int qty){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");
                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "update books set price ="+ price +  " , qty =" + qty + " where id = " + id ;
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }



    //Users
    public void SelectUsers(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select * from users";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            while (rset.next()) {
                System.out.println(rset.getString("username") + ", "
                        + rset.getString("password") + ", "
                        + rset.getString("role"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void InsertUser(Users user){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");
                Statement stmt = conn.createStatement();
        ){
            String sqlInsert = "insert into users (username,password,role) values (" + "'" + user.getUsername() + "', '"  + user.getPassword() + "', "  + user.getRole()  +  ")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    //Customer
    public void SelectCustomer(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select * from khach_hang";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            while (rset.next()) {
                System.out.println(rset.getInt("khachhang_id") + ", "
                        + rset.getString("ten_kh") + ", "
                        + rset.getString("dia_chi") + ", "
                        + rset.getString("so_dt"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    public void InsertCustomer(Customers ct){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");
                Statement stmt = conn.createStatement();
        ){
            String sqlInsert = "insert into khach_hang (ten_kh,dia_chi,so_dt) values (" + "'" + ct.getTen_kh() + "', '"  + ct.getDia_chi() + "', '"  + ct.getSo_dt() +  "'" +  ")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void DeleteCustomer(int kh_id){
        UserView views = new UserView();
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {

            String sqlSelect = "select * from don_hang where kh_id = " + "'" + kh_id + "'";
            ResultSet rset = stmt.executeQuery(sqlSelect);
            if (rset.next()) {
                System.out.println("Tồn tại trong đơn hàng");
            }else{
                String sqlDelete = "DELETE FROM khach_hang WHERE khachhang_id = " + kh_id;
                System.out.println("The SQL statement is: " + sqlDelete + "\n");
                int countDeleted = stmt.executeUpdate(sqlDelete);
                System.out.println(countDeleted + " records deleted.\n");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    public void UpdateCustomer( int id, String dia_chi ,String so_dt ){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");
                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "update khach_hang set  dia_chi =" + "'" + dia_chi + "'" + ",so_dt =" + "'" + so_dt + "'" +  " where khachhang_id = " + id ;
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}