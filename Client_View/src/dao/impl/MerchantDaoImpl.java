package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.MerchantDao;
import po.Merchant;
import util.DbUtil;

public class MerchantDaoImpl implements MerchantDao {

	@Override
	public int addMerchant(Merchant merchant) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMerchant(int mId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMerchan(Merchant merchan) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Merchant> showAllMerchants() {
		List<Merchant> merchants = new ArrayList<Merchant>();

		String sql = "select * from merchant";
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		con = DbUtil.connect();
		int m = 0;
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int mId = rs.getInt("mId");
				String mPersonName = rs.getString("mPersonName");
				String mTel = rs.getString("mTel");
				String mIdCard = rs.getString("mIdCard");
				String mCarfPath = rs.getString("mCarfPath");
				String mLocation = rs.getString("mLocation");
				String mBrand = rs.getString("mBrand");
				String mLogoPath = rs.getString("mLogoPath");
				String mPassword = rs.getString("mPassword");
				Merchant merchant = new Merchant(mId,mPersonName,mTel,mIdCard,mCarfPath,mLocation,mBrand,mLogoPath,mPassword);
				merchant.setmId(mId);
				merchants.add(merchant);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			DbUtil.free(con, pst, null);
		}
		return merchants;
	}

}
