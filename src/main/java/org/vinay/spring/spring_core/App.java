package org.vinay.spring.spring_core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanConfiguration.class);
		AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
		
		System.out.println("\nBefore money trasnfer ");
		System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());
		
		accountService.transferMoney(1, 2, 5.0);
		
		System.out.println("\nAfter money trasnfer");
		System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());
	
	}
}
