package ita.project2.merchant.dao;

public interface LoginDao {
	
	int insertUser(String mPersonName, String mTel, String mPassword);
	
	int countUser(String mTel,String mPassword);
	

}
