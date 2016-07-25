package com.oocl.ita.starkxiao.project2.admin.dao.access;

import java.util.List;

import com.oocl.ita.starkxiao.project2.admin.dao.po.Merchant;

public interface MerchantDao {
	public int add(Merchant m);
	public int delete(int id);
	public int update(Merchant m);
	public int initStatus(Merchant m);
	public int updateStatus(String tel, int status);
	public List<Merchant> select();
	public Merchant select(int id);
}
