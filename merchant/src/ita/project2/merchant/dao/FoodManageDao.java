package ita.project2.merchant.dao;

import java.util.List;

import ita.project2.merchant.model.Food;

public interface FoodManageDao {

	int  getMTel(String mTel);
	
	int saveFood(Food food);
	
	List<Food> showAllFood(int mId);
	
	int deleteFoodByFId(int fId);
}
