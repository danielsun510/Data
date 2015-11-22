package com.infsci.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Member_RegisterDao {
	
		public static boolean Member_Register(String m_name,String m_pwd,String m_address,
				String m_kind,String m_buzkind,String m_income,String m_age,String m_sex,String m_marriage){
			Connection conn = null;
			PreparedStatement ps =null;
			ResultSet rs = null;
			boolean flag = false;
			try {
				conn = DBConnection.getConnection();
				String sql = "insert into t_member values(t_me_se.nextval+1,?,?,?,?,?,?,?,?,?) ";
				ps =conn.prepareStatement(sql);
				ps.setString(1, m_name);
				ps.setString(2, m_pwd);
				ps.setString(3, m_address);
				ps.setString(4, m_kind);
				ps.setString(5, m_buzkind);
				ps.setInt(6,Integer.parseInt(m_income));
				ps.setInt(7,Integer.parseInt(m_age));
				ps.setString(8, m_sex);
				ps.setString(9, m_marriage);
				
			
				int i =ps.executeUpdate();
				if(i>0){
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
