package service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dao.FoodDao;
import dao.impl.FoodDaoImpl;
import po.Food;
import service.FoodManager;
import util.DbUtil;

public class FoodManagerImpl implements FoodManager {

	private FoodDao fd=new FoodDaoImpl();
	@Override
	public int addFood(Food food) {
		// TODO Auto-generated method stub
		return fd.addFood(food);
	}

	@Override
	public int deleteFood(int fId) {
		// TODO Auto-generated method stub
		return fd.deleteFood(fId);
	}

	@Override
	public int updateMerchan(Food food) {
		// TODO Auto-generated method stub
		return fd.updateMerchan(food);
	}

	@Override
	public List<Food> showAllFood(int mid) {
		// TODO Auto-generated method stub
	
		return fd.showAllFood(mid);
	}

	@Override
	public Map<Food, Integer> orderFood(int fid) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
