package ita.project2.merchant.service;

import java.util.List;

import ita.project2.merchant.model.Food;

public interface FoodManageService {
	
	 int findMTel(String  mTel);
	 
	 int saveFood(Food food);
	 
	 List<Food> findAllFood(int mId);
	 
	 int deleteFoodByFId(int fId);

}
