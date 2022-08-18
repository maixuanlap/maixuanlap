
import java.sql.*;
import java.util.Scanner;

public class UserView {
    final int SENTINEL = 0;
    int n;
    Scanner scanner = new Scanner(System.in);
    User uc = new User();

    public static void main(String[] args) {
        UserView views = new UserView();
        views.UsersView();
    }

    public void UsersView(){
        System.out.println("Sign Up/Sign In");
        UserView views = new UserView();
        views.menu();
        n = scanner.nextInt();
        while (n != SENTINEL) {
            switch (n) {
                case 1:
                    views.signUp();
                    break;
                case 2:
                    views.signIn();
                    return;
            }
            views.menu();
            n = scanner.nextInt();
        }
        System.out.println("Bye....See you again!");
    }


    public void menu(){
        System.out.println("===================================================");
        System.out.println("0.Out....");
        System.out.println("1.Sign Up");
        System.out.println("2.Sign In");
    }
    public void signUp(){
        System.out.println("Enter name: ");
        String username = scanner.next();
        System.out.println("Enter password: ");
        String password = scanner.next();
        System.out.println("Enter role: ");
        String role = scanner.next();
        Users users = new Users(username, password,role);
        uc.InsertUser(users);
        uc.SelectUsers();
    }

    public void signIn(){
        UserView views = new UserView();
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            System.out.println("Enter users: ");
            String user = scanner.next();
            System.out.println("Enter pass: ");
            String pass = scanner.next();
            String sqlSelect = "select * from users where username = " + "'" + user + "'" + "and password = " + "'" + pass + "'";
            ResultSet rset = stmt.executeQuery(sqlSelect);
            if (rset.next()) {
                System.out.println("Logged in successfully");
                views.menuLogIn();
                n = scanner.nextInt();
                while (n!= SENTINEL){
                    switch (n) {
                        case 1:
                            views.ManageBook();
                        case 2:
                            views.ManageCustomer();
                    }
                    views.menuLogIn();
                    n = scanner.nextInt();
                }
            }else{
                System.out.println("Login unsuccessful");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void ManageBook(){
        UserView views = new UserView();
        views.menuBook();
        int x;
        x = scanner.nextInt();
        while ( x != SENTINEL){
            switch (x) {
                case 1:
                    views.addBook();
                    break;
                case 2:
                    views.updateBook();
                    break;
                case 3: views.deleteBook();
                    break;
                case 4: uc.SelectBook();
                    break;
            }
            views.menuBook();
            x = scanner.nextInt();
        }
    }

    public void ManageCustomer(){
        UserView views = new UserView();
        views.menuCustomer();
        int y;
        y = scanner.nextInt();
        while ( y != SENTINEL){
            switch (y){
                case 1:
                    views.addCustomer();
                    break;
                case 2:
                    views.updateCustomer();
                    break;
                case 3:
                    views.deleteCustomer();
                    break;
                case 4 :
                    uc.SelectCustomer();
                    break;
            }
            views.menuCustomer();
            y = scanner.nextInt();
        }
    }
    //Customer
    public void menuCustomer(){
        System.out.println("0.Quay lại");
        System.out.println("1.Thêm khách hàng");
        System.out.println("2.Sửa khách hàng");
        System.out.println("3.Xóa sản phẩm");
        System.out.println("4.Hiển thị khách hàng");
    }
    public void addCustomer(){
        System.out.println("Enter name: ");
        String ten_kh = scanner.nextLine();
//        ten_kh = scanner.nextLine();
        System.out.println("Enter address: ");
        String dia_chi = scanner.nextLine();
//        dia_chi = scanner.nextLine();
        System.out.println("Enter phone: ");
        String so_dt = scanner.next();
        Customers ct = new Customers(ten_kh,dia_chi,so_dt);
        uc.InsertCustomer(ct);
    }

    public void deleteCustomer(){
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        uc.DeleteCustomer(id);
    }
    public void updateCustomer(){
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        System.out.println("Enter address: ");
        String dia_chi = scanner.nextLine();
        dia_chi = scanner.nextLine();
        System.out.println("Enter phone: ");
        String so_dt = scanner.next();
        uc.UpdateCustomer(id,dia_chi,so_dt);
    }
    //LogAccount
    public void menuLogIn(){
        System.out.println("1.Quản lí sản phẩm");
        System.out.println("2.Quản lí khách hàng");
    }

    //Book
    public void menuBook(){
        System.out.println("0.Quay lại");
        System.out.println("1.Thêm sản phẩm");
        System.out.println("2.Sửa sản phẩm");
        System.out.println("3.Xóa sản phẩm");
        System.out.println("4.Hiển thị sản phẩm");
    }



    public void addBook(){
        System.out.println("Enter name: ");
        String bookname = scanner.nextLine();
//        bookname = scanner.nextLine();
        System.out.println("Enter price: ");
        double price = scanner.nextDouble();
        System.out.println("Enter qty: ");
        int qty = scanner.nextInt();
        Book book = new Book(bookname, price, qty);
        uc.InsertBook(book);
    }

    public void deleteBook(){
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        uc.DeleteBook(id);
    }

    public void updateBook(){
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        System.out.println("Enter price: ");
        double price = scanner.nextDouble();
        System.out.println("Enter qty: ");
        int qty = scanner.nextInt();
        uc.UpdateBook(id,price,qty);
    }
}