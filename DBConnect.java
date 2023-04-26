import java.sql.*;

public class DBConnect {
    Connection conn;
    public void doConnectDB(){
        String connectionStr = "jdbc:mysql://localhost:3306/expensemanager";
        String user = "root";
        String password = "";

        // Connect to the database

        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(connectionStr, user, password);

                System.out.print("DB Connection is seccussful!");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public void fetchData() {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM userTable");

            while (rs.next()) {

            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String args[]){
        DBConnect dbObj = new DBConnect();
        dbObj.doConnectDB();
     //   dbObj.fetchData();
    }



}