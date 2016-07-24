package com.oocl.ita.starkxiao.project2.admin.util;

public class AuditPwdUtil {
	public boolean checkPass(String pwd){
		//using file to stroe the password
		return pwd.equals("123");
	}
}
