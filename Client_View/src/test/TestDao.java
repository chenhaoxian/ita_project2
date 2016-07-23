package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dao.FoodDao;
import dao.MerchantDao;
import dao.impl.FoodDaoImpl;
import dao.impl.MerchantDaoImpl;
import po.Food;
import po.Merchant;

public class TestDao {

		FoodDao foodDao=new FoodDaoImpl();
		MerchantDao merchantDao= new  MerchantDaoImpl();
	@Test
	public void test() {
		List<Food> foods=foodDao.showAllFood(1);
		for(Food food:foods){
		System.out.println(food.getfName());}
	}
	@Test
	public void testListMerchant() {
		List<Merchant> merchants=merchantDao.showAllMerchants();
		for(Merchant merchant:merchants){
		System.out.println(merchant.getmLocation());
		System.out.println(merchant.getmBrand());}
	}

}
