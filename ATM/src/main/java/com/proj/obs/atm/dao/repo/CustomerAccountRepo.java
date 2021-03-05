package com.proj.obs.atm.dao.repo;

import org.springframework.data.repository.CrudRepository;

import com.proj.obs.atm.dao.pojo.CustomerAccount;


public interface CustomerAccountRepo extends CrudRepository<CustomerAccount, String> {
	public CustomerAccount findByAmount(int amount);
}
