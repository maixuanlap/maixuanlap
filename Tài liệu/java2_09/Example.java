import java.sql.*;

public class Example {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            ResultSet rset = stmt.executeQuery("select * from books");
            //Get the metadata of the  ResultSet
            ResultSetMetaData rsetMD = rset.getMetaData();
            //Get the number of column from metadata
            int numColumns = rsetMD.getColumnCount();

            for ( int i = 1; i <= numColumns; i++){
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1 ; i <= numColumns; i++){
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnName(i) + ")");
            }
            System.out.println();
            while (rset.next()){
                for ( int i = 1; i <= numColumns; ++i){
                    //getString() can be used for all column types
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        }
    }
