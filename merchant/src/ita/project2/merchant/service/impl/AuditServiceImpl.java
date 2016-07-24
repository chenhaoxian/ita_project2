package ita.project2.merchant.service.impl;

import ita.project2.merchant.dao.AuditDao;
import ita.project2.merchant.dao.impl.AuditDaoImpl;
import ita.project2.merchant.service.AuditService;

public class AuditServiceImpl implements AuditService {

	@Override
	public int findMerchantStatus(String mTel) {
		AuditDao auditDao = new AuditDaoImpl();
		
		return auditDao.getMerchantStatus(mTel);
	}

}
