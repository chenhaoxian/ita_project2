package ita.project2.merchant.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ita.project2.merchant.dao.LoginDao;
import ita.project2.merchant.util.DbUtil;

public class LoginDaoImpl implements LoginDao {

	@Override
	public int insertUser(String mPersonName, String mTel, String mPassword) {
		Connection con = DbUtil.connect();
		PreparedStatement pst = null;
		String sql = "insert into merchant(mid,mPersonName,mTel,mPassword) values(HYMAN_SEQ01.nextval,?,?,?)";
		int count = 0;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, mPersonName);
			pst.setString(2, mTel);
			pst.setString(3, mPassword);
			count = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int countUser(String mTel, String mPassword) {
		Connection con = DbUtil.connect();
		PreparedStatement pst = null;
		String sql ="select count(1) as count from merchant where mTel = ? and mPassword = ?";
		int count = 0;
		ResultSet rs = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, mTel);
			pst.setString(2, mPassword);
			rs = pst.executeQuery();
			while(rs.next()){
				count = rs.getInt("count");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public String findPersonName(String mTel) {
		Connection con = DbUtil.connect();
		PreparedStatement pst = null;
		String sql = "select mPersonName from merchant where mTel = ?";
		ResultSet rs = null;
		String name = null;
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1, mTel);
			rs = pst.executeQuery();
			while(rs.next()){
				name = rs.getString("mPersonName");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
	}

	@Override
	public int saveMerchantInPermission(String mTel) {
		Connection con = DbUtil.connect();
		PreparedStatement pst = null;
		String sql = "insert into permission(mtel,mstatus) values(?,1)";
		int count = 0;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, mTel);
			count = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

}
