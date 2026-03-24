package com.winter.app.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.winter.app.util.DBConnection;

public class CountryDAO {
	
	
	public void list() throws Exception {
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			String name = rs.getString("COUNTRY_NAME");
			String id = rs.getString("COUNTRY_ID");
			System.out.println(id + " : "+name);
		}
		
		rs.close();
		st.close();
		con.close();
	}

}
