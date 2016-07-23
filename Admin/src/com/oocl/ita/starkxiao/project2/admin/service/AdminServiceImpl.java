package com.oocl.ita.starkxiao.project2.admin.service;

import java.util.List;

import com.oocl.ita.starkxiao.project2.admin.dao.po.Merchant;

public class AdminServiceImpl implements AdminService {

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
