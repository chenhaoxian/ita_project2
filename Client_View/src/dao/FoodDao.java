package dao;

import java.util.List;

import po.Food;


public interface FoodDao {
	public int addFood(Food food);
	public int deleteFood(int fId);
	public int  updateMerchan(Food food);
	public List<Food> showAllFood();
}
