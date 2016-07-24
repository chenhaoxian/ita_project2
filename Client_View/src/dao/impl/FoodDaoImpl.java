package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.FoodDao;
import po.Food;
import util.DbUtil;

public class FoodDaoImpl implements FoodDao {

	@Override
	public int addFood(Food food) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteFood(int fId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMerchan(Food food) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Food> showAllFood(int mid) {
		// TODO Auto-generated method stub	
			List<Food> ds = new ArrayList<Food>();

			String sql = "select * from food where mId=?";
			Connection con = null;
			PreparedStatement pst = null;
			ResultSet rs = null;
			con = DbUtil.connect();
			try {
				pst = con.prepareStatement(sql);
				pst.setInt(1,mid);
				rs = pst.executeQuery();
				while (rs.next()) {
					int id = rs.getInt("fId");
					String fName = rs.getString("fName");
					double fPrice = Double.parseDouble(rs.getString("fPrice"));
					String fViewPath = rs.getString("fViewPath");
					Food food  = new Food(fName,fPrice,fViewPath);
					food.setfId(id);
					ds.add(food);
				}
			} catch (SQLException e) {

				e.printStackTrace();
			} finally {
				DbUtil.free(con, pst, null);
			}
		return ds;
	}

}
