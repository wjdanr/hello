package jener.client.dao;

import java.sql.*;
import java.util.*;
public class ZipcodeDAO {
    // 연결
    private Connection conn;
    // 문장 전송 => SQL
    private PreparedStatement ps;
    //연결 => 오라클 주소
    private final String URL="jdbc:oracle:thin:@localhost:1521:XE";

    // 드라이버 등록
    public ZipcodeDAO()
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    // 연결
    public void getConnection() {
        try {
            conn=DriverManager.getConnection(URL,"hr","happy");
            //conn hr/happy
        }catch(Exception ex) {}
    }
    //닫기
    public void disConnection() {
        try {
            if(ps!=null)ps.close();
            if(conn!=null)conn.close();
            //exit
        }catch(Exception ex) {}
    }
    // 우편번호 찾기
    public ArrayList<ZipcodeVO> postfind(String dong){
        ArrayList<ZipcodeVO> list=
                new ArrayList<ZipcodeVO>();
        try {
            // 연결
            getConnection();
            // SQL 문장 전송
            String sql="SELECT * FROM zipcode "+"WHERE dong LIKE '%'||?||'%'";
            ps=conn.prepareStatement(sql);
            ps.setString(1, dong);
            ResultSet rs=ps.executeQuery();//실행
            while(rs.next()){
                ZipcodeVO vo=new ZipcodeVO();
                vo.setZipcode(rs.getString(1));
                vo.setSido(rs.getString(2));
                vo.setGugun(rs.getString(3));
                vo.setDong(rs.getString(4));
                vo.setBunji(rs.getString(5));

                list.add(vo);
            }
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }finally {
            disConnection();
        }return list;
        }
    }