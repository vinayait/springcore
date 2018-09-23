package org.vinay.spring.spring_core;

public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transferMoney(long sourceAccountId, long targetAccountId, double amount) {
		// TODO Auto-generated method stub
		Account sourceAccount = accountDao.find(sourceAccountId);
		Account targetAccount = accountDao.find(targetAccountId);
		sourceAccount.setBalance(sourceAccount.getBalance() - amount);
		targetAccount.setBalance(targetAccount.getBalance() + amount);
		accountDao.update(sourceAccount);
		accountDao.update(targetAccount);		
	}

	@Override
	public void depositMoney(long accountId, double amount) throws Exception {
		// TODO Auto-generated method stub
		Account account = accountDao.find(accountId);
		account.setBalance(account.getBalance() + amount);
		accountDao.update(account);		
	}

	@Override
	public Account getAccount(long accountId) {
		// TODO Auto-generated method stub
		return accountDao.find(accountId);
	}

}