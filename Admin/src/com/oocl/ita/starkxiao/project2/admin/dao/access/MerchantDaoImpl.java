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
		Merchant m = null;

		try {
			pst = conn.prepareStatement(sql);
			resultSet = pst.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("mid");
				String name = resultSet.getString("mPersonName");
				String tel = resultSet.getString("mTel");
				String card = resultSet.getString("mIdCard");
				String card_path = resultSet.getString("mCardPath");
				String location = resultSet.getString("mLocation");
				String brand = resultSet.getString("mBrand");
				String logo_path = resultSet.getString("mLogoPath");
				int status = resultSet.getInt("mStatus");
				
				m = new Merchant();
				m.setmPersonName(name);
				m.setmTel(tel);
				m.setmIdCard(card);
				m.setmCardPath(card_path);
				m.setmLocation(location);
				m.setmBrand(brand);
				m.setmLogoPath(logo_path);
				m.setmId(id);
				m.setmStatus(status);

				merchantResult.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
		// nothing here
		return 0;
	}

	@Override
	public int initStatus(Merchant m) {
		String sql1 = "update Merchant set mIdCard=?, mCardPath=?, mLocation=?, mBrand=?, mLogoPath=? where mTel=?";
		String sql2 = "update Permission set mStatus=? where mTel=?";
		String root = "http://10.222.232.155:8080/images/upload/";
		Connection conn = DbUtil.connect();
		PreparedStatement pst1 = null;
		PreparedStatement pst2 = null;
		int effectResult = 0;

		try {
			conn.setAutoCommit(false);
			pst1 = conn.prepareStatement(sql1);
			pst1.setString(1, m.getmIdCard());
			pst1.setString(2, root + m.getmCardPath());
			pst1.setString(3, m.getmLocation());
			pst1.setString(4, m.getmBrand());
			pst1.setString(5, root + m.getmLogoPath());
			pst1.setString(6, m.getmTel());
			effectResult = pst1.executeUpdate();

			pst2 = conn.prepareStatement(sql2);
			pst2.setInt(1, 1);
			pst2.setString(2, m.getmTel());
			effectResult = pst2.executeUpdate();
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pst1 != null)
					pst1.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			DbUtil.free(conn, pst2, null);
		}
		return effectResult;
	}

}
