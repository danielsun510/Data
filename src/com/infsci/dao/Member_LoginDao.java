package com.infsci.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Member_LoginDao {
	public static boolean Member_Login(String m_name,String m_pwd){
		Connection conn = null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		boolean flag = false;
		try {
			conn = DBConnection.getConnection();
			String sql = "select * from t_member where m_name =? and m_pwd =?";
			ps =conn.prepareStatement(sql);
			ps.setString(1, m_name);
			ps.setString(2, m_pwd);
			rs = ps.executeQuery();
			System.out.println(m_name+"&&"+m_pwd);
			if(rs.next()){
				String ex_m_name =rs.getString("m_name");
				String ex_m_pwd = rs.getString("m_pwd");
				if((m_name.equals(ex_m_name))&&(m_pwd.equals(ex_m_pwd))){
					flag = true;
				}
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
