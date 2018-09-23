package org.vinay.spring.spring_core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountDaoInMemoryImpl implements AccountDao{
	
	private Map<Long, Account> accountsMap = new HashMap<>();
	
	{
		Account account1 = new Account();
		account1.setId(1L);
		account1.setOwnerName("Drake");
		account1.setBalance(1000.0);
		
		Account account2 = new Account();
		account2.setId(2L);
		account2.setOwnerName("Tim Cook");
		account2.setBalance(99999.0);
		
		accountsMap.put(account1.getId(), account1);
		accountsMap.put(account2.getId(), account2);
	}
	
	@Override
	public void update(Account account) {
		accountsMap.put(account.getId(), account);
	}
	
	@Override
	public Account find(long accountId) {
		return accountsMap.get(accountId);
	}

	@Override
	public void insert(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(List<Account> accounts) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long accountId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Account> find(List<Long> accountIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> find(String ownerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> find(boolean locked) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
