import java.sql.*;


public class test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {

            Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.25.56:3306/ieumfile",
                    "ieumfile","ieumfile");
            System.out.println("success");
            Statement stmt = conn.createStatement();

        } catch (SQLException ex) {
            System.out.println("SQLException" + ex);
        }



    }

}
