package com.oocl.ita.starkxiao.project2.admin.dao.access;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.oocl.ita.starkxiao.project2.admin.dao.po.Merchant;

public class MerchantDaoImplTest {
	public MerchantDao md = new MerchantDaoImpl();
	List<Merchant> ms = new ArrayList<>();

	@Test
	public void testUpdateStatus() {
		System.out.println(md.updateStatus("10086", 1));
		
		ms = md.select();
		for(Merchant each : ms){
			System.out.println(each.getmTel());
			System.out.println(each.getmStatus());
		}
	}

	@Test
	public void testSelect() {
		ms = md.select();
		for(Merchant each : ms){
			System.out.println(each.getmTel());
			System.out.println(each.getmStatus());
		}
	}


	@Test
	public void testInitStatus() {
		ms = md.select();
		Merchant temp = ms.get(0);
		temp.setmIdCard("5555");
		System.out.println(md.initStatus(temp));
		
	}

}
