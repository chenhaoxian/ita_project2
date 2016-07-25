package service;

import java.util.List;
import java.util.Map;

import po.Food;

public interface FoodManager {
	public int addFood(Food food);
	public int deleteFood(int fId);
	public int  updateMerchan(Food food);
	public List<Food> showAllFood(int mid);
	public Map<Food, Integer> orderFood(int fid);
}
