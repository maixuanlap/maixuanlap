import java.sql.*;
public class JdbcPreparedStatementTest {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
             Statement stmt = conn.createStatement();

             PreparedStatement pstmt = conn.prepareStatement(
                     "insert into books values (?,?,?,?,?)");
             PreparedStatement pstmtSelect = conn.prepareStatement("select * from books");
        ) {
            pstmt.setInt(1,7008);
            pstmt.setString(2,"Mahjong 101");
            pstmt.setString(3,"Kumar");
            pstmt.setDouble(4,88.88);
            pstmt.setInt(5,88);

            int rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + "rows affected.");

            pstmt.setInt(1,7009);
            pstmt.setString(2,"Mahjong 102");


            rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + "rows affected.");

            ResultSet rset = pstmtSelect.executeQuery();
            while (rset.next()){
                System.out.println(rset.getInt("id")+"," +
                        rset.getString("title")+","+
                        rset.getString("author")+","+
                        rset.getDouble("price")+","+
                        rset.getInt("qty")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
