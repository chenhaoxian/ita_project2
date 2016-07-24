package ita.project2.merchant.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ita.project2.merchant.dao.AuditDao;
import ita.project2.merchant.util.DbUtil;

public class AuditDaoImpl implements AuditDao {

	@Override
	public int getMerchantStatus(String mTel) {
		Connection con = DbUtil.connect();
		PreparedStatement pst = null;
		int status = 0;
		ResultSet rs = null;
		String sql = "select mStatus from permission where mtel = ?";
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, mTel);
			rs = pst.executeQuery();
			while(rs.next()){
				status = rs.getInt("mStatus");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

}
