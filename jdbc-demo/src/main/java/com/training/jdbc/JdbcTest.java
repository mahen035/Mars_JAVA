package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		//String url = "jdbc:sqlserver://localhost;databaseName=mars_new";
		
		String url = "jdbc:sqlserver://localhost:1433;" +
	     "databaseName=mars_new"; //+
	     //"encrypt=true;trustServerCertificate=true";
		
		String user = "sa";
		
		String password = "root";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String query = "select * from product where prod_desc = ? and price > ?";
		
		//Statement stmt = con.createStatement();	
		
		PreparedStatement pstmt = con.prepareStatement(query);
		
		pstmt.setString(1, "SAMSUNG");
		pstmt.setInt(2, 600);
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			System.out.print("Prod_name: "+rs.getString("prod_name"));
			System.out.print(" Prod_desc: "+rs.getString("prod_desc"));
			System.out.print(" Prod_price: "+rs.getDouble("price"));
			System.out.println();
		}
		
		
	}

}
