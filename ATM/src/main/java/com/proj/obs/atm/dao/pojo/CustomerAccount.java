package com.proj.obs.atm.dao.pojo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="CUSTOMER_ACCOUNT")
public class CustomerAccount {
	
	@Id
	@Column(name = "ACCOUNT_ID")
	private String accountId;
	@Column(name = "BANK_ACCOUNT")
	private String bankAccount;
	@Column(name = "AMOUNT")
	private int amount;
	@Column(name = "ACCOUNT_TYPE")
	private String accountType;
	
	public CustomerAccount() {
	}
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
}
