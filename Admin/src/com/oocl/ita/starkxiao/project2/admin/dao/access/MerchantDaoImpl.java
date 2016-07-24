package com.oocl.ita.starkxiao.project2.admin.dao.access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oocl.ita.starkxiao.project2.admin.dao.po.Merchant;

public class MerchantDaoImpl implements MerchantDao {

	@Override
	public int add(Merchant m) {
		// nothing here
		return 0;
	}

	@Override
	public int delete(int id) {
		// nothing here
		return 0;
	}

	@Override
	public int updateStatus(String tel, int status) {
		String sql = "update Permission set mStatus=? where mTel=?";
		Connection conn = DbUtil.connect();
		PreparedStatement pst = null;
		int effectResult = 0;

		try {
			conn.setAutoCommit(false);
			pst = conn.prepareStatement(sql);
			pst.setInt(1, status);
			pst.setString(2, tel);
			effectResult = pst.executeUpdate();
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.free(conn, pst, null);
		}
		return effectResult;
	}

	@Override
	public List<Merchant> select() {
		List<Merchant> merchantResult = new ArrayList<Merchant>();
		String sql = "select * from MERCHANT left join permission on merchant.mtel = permission.mtel";
		Connection conn = DbUtil.connect();
		PreparedStatement pst = null;
		ResultSet resultSet = null;
		Merchant m = new Merchant();
		
		try {
			pst = conn.prepareStatement(sql);
			resultSet = pst.executeQuery();
			while(resultSet.next()){
				int id = resultSet.getInt("mid");
				String name = resultSet.getString("mPersonName");
				String tel = resultSet.getString("merchant.mTel");
				String card = resultSet.getString("mIdCard");
				String card_path = resultSet.getString("mCardPath");
				String location = resultSet.getString("mLocation");
				String brand = resultSet.getString("mBrand");
				String logo_path = resultSet.getString("mLogoPath");
				int status = resultSet.getInt("mStatus");
				
				m.setmPName(name);
				m.setmTel(tel);
				m.setmIdCard(card);
				m.setmCardPath(card_path);
				m.setmLocation(location);
				m.setmBrand(brand);
				m.setmLogoPath(logo_path);
				m.setmId(id);
				m.setMStatus(status);
				
				merchantResult.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbUtil.free(conn, pst, null);
		}
		return merchantResult;
	}

	@Override
	public Merchant select(int id) {
		// nothing here
		return null;
	}

	@Override
	public int update(Merchant m) {
		//nothing here
		return 0;
	}

}
