package ita.project2.merchant.service.impl;

import java.util.List;

import ita.project2.merchant.dao.FoodManageDao;
import ita.project2.merchant.dao.impl.FoodManageDaoImpl;
import ita.project2.merchant.model.Food;
import ita.project2.merchant.service.FoodManageService;

public class FoodManageServiceImpl implements FoodManageService{

	private FoodManageDao foodManageDao = new FoodManageDaoImpl();
	@Override
	public int  findMTel(String mTel) {
		
		
		return foodManageDao.getMTel(mTel);
	}

	@Override
	public int saveFood(Food food) {
		
		return foodManageDao.saveFood(food);
	}

	@Override
	public List<Food> findAllFood(int  mId) {
		
		
		return foodManageDao.showAllFood(mId);
	}

	@Override
	public int deleteFoodByFId(int fId) {
		// TODO Auto-generated method stub
		return foodManageDao.deleteFoodByFId(fId);
	}
	
	

}
