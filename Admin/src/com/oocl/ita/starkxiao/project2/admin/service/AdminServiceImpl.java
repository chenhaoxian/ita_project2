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
		return merchantDao.select();
	}

	@Override
	public void loadAuditMerchantListJMS() {
		//use a JMSListener to get a message from JMS, then using the xml-parse to transfer to object
		//save them into a datatable temporally

	}

	@Override
	public List<Merchant> listAuditMerchant() {
		return merchantDao.select();
	}

	@Override
	public void confirmMerchant(String mTel) {
		//let the merchant pass the audition
		merchantDao.updateStatus(mTel, 2);
	}

	@Override
	public void merchantBlockToggle(String mTel) {
		//toggle the merchant to the blacklist or white-list
		merchantDao.updateStatus(mTel, 4);
	}

	@Override
	public void rejectMerchant(String mTel) {
		// TODO Auto-generated method stub
		merchantDao.updateStatus(mTel, 3);
	}

}
