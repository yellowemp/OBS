package com.proj.obs.atm.process;

import java.util.Collections;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

import com.proj.obs.DAO.processcom.proj.obs.dao1.process.CustomerImpl;
import com.proj.obs.DAO.processcom.proj.obs.dao1.process.CustomerIntf;
import com.proj.obs.atm.dao.pojo.CustomerAccount;
import com.proj.obs.atm.dao.repo.CustomerAccountRepo;
import com.proj.obs.atm.model.CustomerInfo;
import com.proj.obs.atm.service.CustomerService;
import com.proj.obs.atm.service.CustomerServiceIntf;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class CustomerInfoTest {
	
	@Autowired
	private CustomerAccountRepo customerAccountRepo;
	
    @Test
	public void contextLoads() {
    	CustomerServiceIntf customerInfo = new CustomerService(customerAccountRepo);
    	System.out.println(customerInfo.getAllCustomer());
	}
}
