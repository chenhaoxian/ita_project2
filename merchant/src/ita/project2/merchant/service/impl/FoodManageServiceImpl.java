package ita.project2.merchant.service.impl;

import ita.project2.merchant.dao.FoodManageDao;
import ita.project2.merchant.dao.impl.FoodManageDaoImpl;
import ita.project2.merchant.service.FoodManageService;

public class FoodManageServiceImpl implements FoodManageService{

	@Override
	public int  findMTel(String mTel) {
		FoodManageDao foodManageDao = new FoodManageDaoImpl();
		
		return foodManageDao.getMTel(mTel);
	}

}
