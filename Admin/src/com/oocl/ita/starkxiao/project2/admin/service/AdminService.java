package com.oocl.ita.starkxiao.project2.admin.service;

import java.util.List;

import com.oocl.ita.starkxiao.project2.admin.dao.po.Merchant;

public interface AdminService {
	public List<Merchant> listAllMerchant();
	public void loadAuditMerchantListJMS();
	public List<Merchant> listAuditMerchant();
	public void confirmMerchant(String mTel);
	public void rejectMerchant(String mTel);
	public void merchantBlockToggle(String mTel);
}
