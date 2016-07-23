package com.oocl.ita.starkxiao.project2.admin.service;

import java.util.List;

import com.oocl.ita.starkxiao.project2.admin.dao.access.MerchantDao;
import com.oocl.ita.starkxiao.project2.admin.dao.access.MerchantDaoImpl;
import com.oocl.ita.starkxiao.project2.admin.dao.po.Merchant;

public class AdminServiceImpl implements AdminService {
	private MerchantDao merchantDao;
	
	public AdminServiceImpl() {
		this.merchantDao = new MerchantDaoImpl();
	}
	
	@Override
	public List<Merchant> listAllMerchant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loadAuditMerchantListJMS() {
		//load audit merchant from the JMS, then using the xml-parse to transfer to object

	}

	@Override
	public List<Merchant> listAuditMerchant() {
		//list audit merchant from database
		return null;
	}

}
