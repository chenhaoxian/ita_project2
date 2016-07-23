package service;

import java.util.List;

import po.Merchant;

public interface MerchantManager {
	public int addBook(Merchant b);
	public int deletMerchant(int id);
	public int  updateMerchan(Merchant merchan);
	public List<Merchant> findAllMerchant();
}
