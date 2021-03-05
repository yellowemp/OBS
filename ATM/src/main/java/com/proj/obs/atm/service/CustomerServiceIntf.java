package com.proj.obs.atm.service;


import java.util.List;

import com.proj.obs.atm.model.CustomerInfo;

public interface CustomerServiceIntf {
	public CustomerInfo getCustomerInformation(String id);
	public List<CustomerInfo> getAllCustomer();
	public int getAmount(int amount);
}
