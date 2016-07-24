package ita.project2.merchant.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ita.project2.merchant.dao.FoodManageDao;
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

}
