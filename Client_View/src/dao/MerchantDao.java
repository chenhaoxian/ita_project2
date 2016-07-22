package dao;

import java.util.List;

import po.Merchant;


public interface MerchantDao {
	public int addMerchant(Merchant merchant);
	public int deleteMerchant(int mId);
	public int  updateMerchan(Merchant merchan);
	public List<Merchant> showAllMerchants();
}
