package com.oocl.ita.starkxiao.project2.admin.service;

import java.util.List;

import com.oocl.ita.starkxiao.project2.admin.dao.access.MerchantDao;
import com.oocl.ita.starkxiao.project2.admin.dao.access.MerchantDaoImpl;
import com.oocl.ita.starkxiao.project2.admin.dao.po.Merchant;

public class AdminServiceImpl implements AdminService {
	private MerchantDao merchantDao;
	private int mId;
	
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
		//use a JMSListener to get a message from JMS, then using the xml-parse to transfer to object
		//save them into a datatable temporally

	}

	@Override
	public List<Merchant> listAuditMerchant() {
		//list audit merchant from database
		return null;
	}

	@Override
	public void passMerchant(int mId) {
		//let the merchant pass the audition
		
	}

	@Override
	public void merchantBlockToggle(int mId) {
		//toggle the merchant to the blacklist or white-list
		
	}

}
