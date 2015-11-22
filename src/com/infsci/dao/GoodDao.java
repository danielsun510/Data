package com.infsci.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.infsci.bean.Good;

public class GoodDao {
	
	
//	添加商品
	public boolean addGood(Good good) {
		boolean b = false;

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBConnection.getConnection();
			String sql = "insert into new_good(gname,indate,price1,price2,gtype,gclass,gbrand,gspecs,recom,gnumber,gpic,remark) values(?,?,?,?,?,?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, good.getGname());
			ps.setDate(2, good.getIndate());
			ps.setInt(3, good.getPrice1());
			ps.setInt(4, good.getPrice2());
			ps.setString(5, good.getGtype());
			ps.setString(6,good.getGclass());
			ps.setString(7, good.getGbrand());
			ps.setString(8, good.getGspecs());
			ps.setString(9,good.getRecom());
			ps.setInt(10, good.getGnumber());
			ps.setString(11,good.getGpic());
			ps.setString(12, good.getRemark());
			
			int i = ps.executeUpdate();
			if (i == 1) {
				b = true;
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBConnection.free(null, ps, conn);
		}
		return b;
	}
	
	
	
     //取goodlist
	//查询所有
		public List<Good> getGoodList() {
			List<Good> goodList = new ArrayList<Good>();
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
				conn = DBConnection.getConnection();
				String sql = "select * from new_good";
				ps = conn.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()){
					Good good = new Good();
					good = rsToGood(rs);
					goodList.add(good);
					System.out.println("good已经添加！");
				}
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally{
				DBConnection.free(rs, ps, conn);
			}
			return goodList;
		}
		
		
		
//		删除数据
		public void deleteGood(List<String> goods){
			Connection conn = null;
			PreparedStatement ps = null;
			
			try {
				conn = DBConnection.getConnection();
				String sql = "delete  new_good where gname = ?"; // in (1231,3423,5345,3344)
				ps = conn.prepareStatement(sql);
				//批量执行
				for(String gname : goods){
					ps.setString(1, gname);
					ps.addBatch();//
				}
				ps.executeBatch();
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally{
				DBConnection.free(null, ps, conn);;
			}
		}
	
	
		//根据主键查询
		public Good getGoodById(String gname){
			Good good = null;
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
				conn = DBConnection.getConnection();
				String sql = "select * from new_good where gname = ?";
				ps = conn.prepareStatement(sql);
				ps.setString(1, gname);
				rs = ps.executeQuery();
				if(rs.next()){
					good = rsToGood(rs);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally{
				DBConnection.free(rs, ps, conn);
			}
			return good;
		}
	
	
		private Good rsToGood(ResultSet rs) throws SQLException{
			Good good = new Good();
			good.setGname(rs.getString("gname"));
			good.setIndate(rs.getDate("indate"));
			good.setPrice1(rs.getInt("price1"));
			good.setPrice2(rs.getInt("price2"));
			good.setGbrand(rs.getString("gbrand"));
			good.setGspecs(rs.getString("gspecs"));
			good.setGnumber(rs.getInt("gnumber"));
			return good;
		}
		
	
	

}
