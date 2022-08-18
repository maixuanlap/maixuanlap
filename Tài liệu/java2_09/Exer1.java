import java.sql.*;
public class Exer1 {
    public static void main(String[] args) {
    try (
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
    Statement stmt = conn.createStatement();
        ) {
        ResultSet rset = stmt.executeQuery("select * from khach_hang");
        //Get the metadata of the  ResultSet
        ResultSetMetaData rsetMD = rset.getMetaData();
        //Get the number of column from metadata
        int numColumns = rsetMD.getColumnCount();

        System.out.println("Khach_hang");
        //Print column names - Column Index begins at 1 (instead of 0)
        for ( int i = 1; i <= numColumns; i++){
            System.out.printf("%-30s", rsetMD.getColumnName(i));
        }
        System.out.println();
        //Print column class names
        for (int i = 1 ; i <= numColumns; i++){
            System.out.printf("%-30s",
                    "(" + rsetMD.getColumnName(i) + ")");
        }
        System.out.println();
        //Print column contents for all the rows
        while (rset.next()){
            for ( int i = 1; i <= numColumns; ++i){
                //getString() can be used for all column types
                System.out.printf("%-30s", rset.getString(i));
            }
            System.out.println();
        }
        ResultSet rset1 = stmt.executeQuery("select * from don_hang");
        //Get the metadata of the  ResultSet
        ResultSetMetaData rsetMD1 = rset1.getMetaData();
        //Get the number of column from metadata
        int numColumns1 = rsetMD1.getColumnCount();
        System.out.println("Don_hang");
        //Print column names - Column Index begins at 1 (instead of 0)
        for ( int i = 1; i <= numColumns1; i++){
            System.out.printf("%-30s", rsetMD1.getColumnName(i));
        }
        System.out.println();

        //Print column class names
        for (int i = 1 ; i <= numColumns1; i++){
            System.out.printf("%-30s",
                    "(" + rsetMD1.getColumnName(i) + ")");
        }
        System.out.println();

        //Print column contents for all the rows
        while (rset1.next()){
            for ( int i = 1; i <= numColumns1; ++i){
                //getString() can be used for all column types
                System.out.printf("%-30s", rset1.getString(i));
            }
            System.out.println();
        }

    }catch (SQLException ex){
        ex.printStackTrace();
    }
}
}

