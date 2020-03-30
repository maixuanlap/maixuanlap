import java.sql.*;

public class Exercises2 {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");

                Statement stmt = conn.createStatement();

        ) {
            //Update CategoryName
            String strUpdate = "update categories set CategoryName = 'SeaFood VN' where CategoryID = 8";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");

            String strSelect = "select * from categories ";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()) {
                System.out.println(rset.getInt("CategoryID") + ", "
                        + rset.getString("CategoryName") + ", "
                        + rset.getString("Description"));
            }

            //Update Customer
            String strUpdate1 = "update customers set Address = '1A Yet Kieu - Ha Noi' where CustomerID = 'FRANK'";
            System.out.println("The SQL statement is: " + strUpdate1 + "\n");
            int countUpdated1 = stmt.executeUpdate(strUpdate1);
            System.out.println(countUpdated1 + " records affected.\n");

            String strSelect1 = "select * from customers where CustomerID = 'FRANK' ";
            System.out.println("The SQL statement is: " + strSelect1 + "\n");
            ResultSet rset1 = stmt.executeQuery(strSelect1);
            while (rset1.next()) {
                System.out.println(rset1.getString("CustomerID") + ", "
                        + rset1.getString("CompanyName") + ", "
                        + rset1.getString("Address"));
            }

            //Update Products
            String strUpdate2 = "update products set UnitPrice = UnitPrice + (UnitPrice/10) where CategoryID = 5 or CategoryID = 7 or CategoryID = 8";
            System.out.println("The SQL statement is: " + strUpdate2 + "\n");
            int countUpdated2 = stmt.executeUpdate(strUpdate2);
            System.out.println(countUpdated2 + " records affected.\n");

            String strSelect2 = "select * from products where CategoryID = 5 or CategoryID = 7 or CategoryID = 8 ";
            System.out.println("The SQL statement is: " + strSelect2 + "\n");
            ResultSet rset2 = stmt.executeQuery(strSelect2);
            while (rset2.next()) {
                System.out.println(rset2.getString("CategoryID") + ", "
                        + rset2.getString("ProductName") + ", "
                        + rset2.getString("UnitPrice"));
            }

            //Update Orders
            String strUpdate3 = "update orders set ShipVia = 3 where OrderID = 10313";
            System.out.println("The SQL statement is: " + strUpdate3 + "\n");
            int countUpdated3 = stmt.executeUpdate(strUpdate3);
            System.out.println(countUpdated3 + " records affected.\n");

            String strSelect3 = "select * from orders where OrderID = 10313 ";
            System.out.println("The SQL statement is: " + strSelect3 + "\n");
            ResultSet rset3 = stmt.executeQuery(strSelect3);
            while (rset3.next()) {
                System.out.println(rset3.getString("OrderID") + ", "
                        + rset3.getString("ShipName") + ", "
                        + rset3.getString("ShipVia"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}