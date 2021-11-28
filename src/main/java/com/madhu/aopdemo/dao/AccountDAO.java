/**
 * 
 */
package com.madhu.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.madhu.aopdemo.Account;

/**
 * @author 15197
 * Create target object: AccountDAO
 */
@Component
public class AccountDAO {
	private String name;
	private String serviceCode;
	
	// add a new method findAccounts
	public List<Account> findAccounts()	{
		System.out.println(getClass() + ": Finding an account");
		List<Account> myAccounts = new ArrayList();
		
		// create simple accounts
		
		myAccounts.add(new Account("Toyota","Camry"));
		myAccounts.add(new Account("Honda","Accord"));
		myAccounts.add(new Account("Audi","A8"));
		myAccounts.add(new Account("Bugati","Veron"));
		
		return myAccounts;
	}
	
	public void addAccount() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	
	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	
	public void addMember() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADD A MEMBER FROM ACCOUNTDAO");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		System.out.println("inside accountDAP.getName()");
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		System.out.println("inside accountDAP.setName(name)");
		this.name = name;
	}

	/**
	 * @return the serviceCode
	 */
	public String getServiceCode() {
		System.out.println("inside accountDAP.getServiceCode()");
		return serviceCode;
	}

	/**
	 * @param serviceCode the serviceCode to set
	 */
	public void setServiceCode(String serviceCode) {
		System.out.println("inside accountDAP.setServiceCode(serviceCode)");
		this.serviceCode = serviceCode;
	}
	
}
