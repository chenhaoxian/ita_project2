package ita.project2.merchant.service;

public interface LoginService {
	
	int register(String mPersonName, String mTel, String mPassword);
	
	boolean login(String mTel, String mPassword);
	
	String getPersonName(String mtel);

}
