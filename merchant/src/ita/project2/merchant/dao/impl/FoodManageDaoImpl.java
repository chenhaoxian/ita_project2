package ita.project2.merchant.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ita.project2.merchant.dao.FoodManageDao;
import ita.project2.merchant.model.Food;
import ita.project2.merchant.util.DbUtil;

public class FoodManageDaoImpl implements FoodManageDao {

	@Override
	public int  getMTel(String mTel) {
		Connection con = DbUtil.connect();
		PreparedStatement pst = null;
		String sql = "select mId from merchant where mTel = ?";
		ResultSet rs = null;
		int  id = 0;
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, mTel);
			rs = pst.executeQuery();
			while(rs.next()){
				id = rs.getInt("mId");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return id;
	}

	@Override
	public int saveFood(Food food) {
		Connection con  = DbUtil.connect();
		PreparedStatement pst = null;
		String sql = "insert into food(fId,fname,mid,fprice,fviewpath) values(HYMAN_SEQ01.nextval,?,?,?,?)";
		int count = 0;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, food.getfName());
			pst.setInt(2, food.getmId());
			pst.setInt(3, food.getfPrice());
			pst.setString(4, food.getfViewPath());
			count = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public List<Food> showAllFood(int mId) {
		Connection con = DbUtil.connect();
		PreparedStatement pst = null;
		String sql = "select * from food where mId = ?";
		ResultSet rs = null;
		List<Food> list = new ArrayList<Food>();
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, mId);
			rs = pst.executeQuery();
			while(rs.next()){
				Food food = new Food();
				food.setfId(rs.getInt("fId"));
				food.setfName(rs.getString("fName"));
				food.setmId(mId);
				food.setfPrice(rs.getInt("fPrice"));
				food.setfViewPath(rs.getString("fViewPath"));
				list.add(food);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteFoodByFId(int fId) {
		Connection con = DbUtil.connect();
		PreparedStatement pst = null;
		String sql = "delete from food where fId = ?";
		int count = 0;
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, fId);
			count = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
	}

}
