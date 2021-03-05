package com.proj.obs.atm.repo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.proj.obs.atm.dao.pojo.CustomerAccount;
import com.proj.obs.atm.dao.repo.CustomerAccountRepo;


@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class CustomerAccountRepoTest {
	
	@Autowired
	private TestEntityManager entityManager;

	
	@Autowired
	private CustomerAccountRepo customerAccountRepo;
	
	
	
	@Test
	public void contextLoads() {
		//Iterable<CashAccount> account = cashAccountRepo.findAll();
		CustomerAccount account = customerAccountRepo.findByAmount(1);
		
		System.out.println("Tested amount" + account.getAmount());
		
	}


}
