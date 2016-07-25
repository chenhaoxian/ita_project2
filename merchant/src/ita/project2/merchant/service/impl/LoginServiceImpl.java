package ita.project2.merchant.service.impl;

import ita.project2.merchant.dao.LoginDao;
import ita.project2.merchant.dao.impl.LoginDaoImpl;
import ita.project2.merchant.service.LoginService;

public class LoginServiceImpl implements LoginService {

	private LoginDao loginDao = new LoginDaoImpl();

	@Override
	public int register(String mPersonName, String mTel, String mPassword) {

		return loginDao.insertUser(mPersonName, mTel, mPassword);
	}

	@Override
	public boolean login(String mTel, String mPassword) {
		int count = loginDao.countUser(mTel, mPassword);
		if (count == 0) {
			return false;
		} else {
			return true;
		}

	}

	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	@Override
	public String getPersonName(String mtel) {
		
		return loginDao.findPersonName(mtel);
	}

	@Override
	public int saveMerchantInPermission(String mTel) {
		// TODO Auto-generated method stub
		return loginDao.saveMerchantInPermission(mTel);
	}

}
