package com.infsci.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Check_m_nameDao {
	
	public static boolean Check_m_name(String m_name){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean flag = false;
		try {
			conn = DBConnection.getConnection();
			String sql = "select m_name from t_member where m_name = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, m_name);
			rs = ps.executeQuery();
			if(rs.next()){
				//查找得到说明重复
				flag = true;
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			DBConnection.free(rs, ps, conn);
		}
		return flag;
	}
}
