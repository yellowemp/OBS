package com.proj.obs.atm.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.proj.obs.atm.dao.pojo.CustomerAccount;


public class CustomerInfo {
	
	public CustomerInfo() {
	}
	
	public CustomerInfo(CustomerAccount customerAccount) {
		this.mapSingleData(customerAccount);
	}
	public CustomerInfo(Iterable<CustomerAccount> customerAccountItr) {
		this.mapListData(customerAccountItr);
	}

	private List<CustomerInfo> customerInfoList;
	private String accountID;
	private String bankAccount;
	private int amount;
	private String accType;
	
	

	public List<CustomerInfo> getCustomerInfoList() {
		return customerInfoList;
	}

	public void setCustomerInfoList(List<CustomerInfo> customerInfoList) {
		this.customerInfoList = customerInfoList;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getAccountId() {
		return accountID;
	}

	public void setAccountId(String accountID) {
		this.accountID = accountID;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	private void mapSingleData(CustomerAccount customerAccount) {
		this.accountID = customerAccount.getAccountId();
		this.bankAccount = customerAccount.getBankAccount();
		this.amount = customerAccount.getAmount();
		this.accType = customerAccount.getAccountType();
		
	}
	
	private void mapListData(Iterable<CustomerAccount> customerAccountItr) {
		List<CustomerInfo> custInfoList = new ArrayList<CustomerInfo>();
		CustomerInfo customerInfo = new CustomerInfo();
		for(CustomerAccount customerAccount : customerAccountItr) {
			customerInfo = new CustomerInfo(customerAccount);
			custInfoList.add(customerInfo);
		}
		this.customerInfoList = custInfoList;
		
	}
}
	
	
	
