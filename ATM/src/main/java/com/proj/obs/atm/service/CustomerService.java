package com.proj.obs.atm.service;

import java.util.List;
import java.util.Optional;

import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.obs.DAO.processcom.proj.obs.dao1.process.CustomerIntf;
import com.proj.obs.atm.dao.pojo.CustomerAccount;
import com.proj.obs.atm.dao.repo.CustomerAccountRepo;
import com.proj.obs.atm.model.CustomerInfo;


@Service
public class CustomerService implements CustomerServiceIntf{
	
	private CustomerAccountRepo customerAccountRepo;
	
	private CustomerIntf customerIntf;
	
	public CustomerService(CustomerServiceIntf customerServiceIntf) {
    }
	
	@Autowired
	public CustomerService(CustomerAccountRepo customerAccountRepo) {
        this.customerAccountRepo = customerAccountRepo;
    }

	@Override
	public int getAmount(int amount) {
		System.out.println("aaa");
		CustomerInfo account = customerIntf.getCustomerInfo(amount);
		System.out.println("f " + amount);
		System.out.println("g " + account.getAmount());
		CustomerInfo customerInfo = new CustomerInfo();
		//customerInfo.setAmount(account.getAmount());
		return 1;
	}

	@Override
	public CustomerInfo getCustomerInformation(String id) {
		Optional<CustomerAccount> customerAccount = customerAccountRepo.findById(id);
		return (customerAccount.isPresent()) ? null : new CustomerInfo(customerAccount.get());
	}

	@Override
	public List<CustomerInfo> getAllCustomer() {
		Iterable<CustomerAccount> customerItrList = customerAccountRepo.findAll();
		return (IterableUtils.size(customerItrList) == 0) ? null : new CustomerInfo(customerItrList).getCustomerInfoList();
	}

}
