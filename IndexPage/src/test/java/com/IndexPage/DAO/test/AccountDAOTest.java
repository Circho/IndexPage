package com.IndexPage.DAO.test;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.IndexPage.DAO.AccountDAO;
import com.IndexPage.model.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/META-INF/spring/infrastructure.xml",
		"classpath:/META-INF/spring/applicationContext.xml" })
@Transactional
@TransactionConfiguration(defaultRollback = true)//测试完回滚数据库
public class AccountDAOTest {

	@Autowired
	private AccountDAO accountDao;

	@Test
	public void testRegister() {
		Account account=new Account();
		account.setEmail("test@test2");
		account.setUserName("test");
		account.setPassword("test");
		account.setLevel(0);
		accountDao.register(account);
	}
	
	//@Test
	public void testFindById() {

		Account result=accountDao.FindByID(1l);
		Assert.assertEquals(result.getUserName(), "test");
	}
		
	@Test
	public void testFindByUserName()
	{
		Account account=new Account();
		account.setEmail("test@test");
		account.setUserName("testfortest");
		account.setPassword("testfortest");
		account.setLevel(0);
		accountDao.register(account);
		
		List<Account> result=accountDao.FindByName("testfortest");
		Assert.assertEquals(result.size(), 1);	
		Assert.assertEquals(result.get(0).getPassword(), "testfortest");
	}

	
	@Test
	public void testLogin()
	{
		Account account=new Account();
		account.setEmail("test@test");
		account.setUserName("testfortest");
		account.setPassword("testfortest");
		account.setLevel(0);
		accountDao.register(account);
		
		List<Account> result=accountDao.Login("testfortest", "testfortest");
		Assert.assertEquals(result.size(), 1);	
		Assert.assertEquals(result.get(0).getPassword(), "testfortest");
	}


}
