package service.impl;

import java.util.List;

import dao.MerchantDao;
import dao.impl.MerchantDaoImpl;
import po.Merchant;
import service.MerchantManager;

public class MerchantManagerImpl implements MerchantManager{
	private MerchantDao md= new MerchantDaoImpl();
	@Override
	public int addBook(Merchant b) {
		// TODO Auto-generated method stub
		return md.addMerchant(b);
	}

	@Override
	public int deletMerchant(int id) {
		// TODO Auto-generated method stub
		return md.deleteMerchant(id);
	}

	@Override
	public int updateMerchan(Merchant merchan) {
		// TODO Auto-generated method stub
		return md.updateMerchan(merchan);
	}

	@Override
	public List<Merchant> findAllMerchant() {
		// TODO Auto-generated method stub
		return md.showAllMerchants();
	}

}
