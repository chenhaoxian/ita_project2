package com.oocl.ita.starkxiao.project2.admin.dao.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbUtil {
	private static final String url = "jdbc:oracle:thin:@ITA-031-W7:1521:xe";
	private static final String username = "CHENHY";
	private static final String password = "CHENHY";
	private static String driverClassName = "oracle.jdbc.OracleDriver";
	
	public static Connection connect(){
		Connection conn = null;
		
		try {
			Class.forName(driverClassName);
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void free(Connection conn, PreparedStatement pst, ResultSet rs){
		try {
			if(rs != null){
				rs.close();
			}
			
			if(pst != null){
				pst.close();
			}
			
			if(conn != null){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
