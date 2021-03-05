package com.proj.obs.DAO.processcom.proj.obs.dao1.process;

import com.proj.obs.atm.dao.pojo.CustomerAccount;
import com.proj.obs.atm.model.CustomerInfo;

public interface CustomerIntf {
	public CustomerInfo getCustomerInfo(int amount);
	
	public Iterable<CustomerAccount> getAll();
}
