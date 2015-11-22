package com.infsci.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.infsci.dao.DBConnection;

public class ManagerDAO {
	
	//login
		public boolean login(String username ,int password){
			boolean b = false;
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			try{
				
				conn = DBConnection.getConnection();
				String sql = "select uname , upass from tb_manager where uname=? and upass=?";
				ps = conn.prepareStatement(sql);
				ps.setString(1,username);
				ps.setInt(2, password);
				rs=ps.executeQuery();
				
				if(rs.next()){
					b=true;
				}
			}catch(ClassNotFoundException e){
				e.printStackTrace();
				
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				DBConnection.free(rs, ps, conn);
			}
			
			return b;
			
		}
	

}
