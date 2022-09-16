import java.sql.*;
import java.util.Properties;

public class ieum {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://172.16.25.58:3306/ieumfile";

    static final String USERNAME = "ieumfile";
    static final String PASSWORD = "ieumfile";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            System.out.println("\n -Mysql Connection");
            stmt = conn.createStatement();

            String sql;
            sql = "SELECT nic, ip, mac FROM netstat_nic_tab";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                String nic = rs.getString("nic");
                String ip = rs.getString("ip");
                String mac =rs.getString("mac");

                System.out.println("\n** 이더넷 포트 :" + nic);
                System.out.println("\n  -> 아이피 정보 :" + ip);
                System.out.println("\n mac 주소 :" + mac);
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch (SQLException se1){
            se1.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                if(stmt!=null)
                    stmt.close();
            }catch (SQLException se2){
            }try{
                if(conn!=null)
                    conn.close();
            }catch (SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("]\n\n - MYSQL Connection Close");
    }
}

