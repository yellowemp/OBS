package com.proj.obs.DAO.processcom.proj.obs.dao1.process;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.proj.obs.atm.dao.pojo.CustomerAccount;
import com.proj.obs.atm.dao.repo.CustomerAccountRepo;
import com.proj.obs.atm.model.CustomerInfo;

@Component
@Repository
public class CustomerImpl implements CustomerIntf{
	
	@PersistenceContext
    private EntityManager em;
	
	
	private CustomerAccountRepo customerAccountRepo;
	
	public CustomerImpl() {
		
	}
	
	public CustomerImpl(CustomerIntf customerIntf) {
		
	}
	
	@Autowired
	public CustomerImpl(CustomerAccountRepo customerAccountRepo){
		this.customerAccountRepo = customerAccountRepo;
	}

	@Override
	public CustomerInfo getCustomerInfo(int amount) {
		System.out.println("bbb" + customerAccountRepo);
		CustomerAccount account = customerAccountRepo.findByAmount(amount);
		System.out.println("fa " + amount);
		System.out.println("ga " + account);
		CustomerInfo customerInfo = new CustomerInfo();
		customerInfo.setAmount(account.getAmount());
		return customerInfo;
	}

	@Override
	public Iterable<CustomerAccount> getAll() {
		return customerAccountRepo.findAll();
	}
	
}
