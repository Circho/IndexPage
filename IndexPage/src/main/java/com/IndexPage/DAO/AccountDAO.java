package com.IndexPage.DAO;

import java.util.List;

import com.IndexPage.model.Account;


/**
 * 
 * @author huangyuan
 *
 */
public interface AccountDAO {

	
	//
	public Account FindByID(Long ID);
	
	public List<Account> FindByName(String UserName);
	
	public List<Account> FindByEmail(String Email);
	
	public List<Account> findAllOrderedByName(); 
	
	
	//
	public void register(Account account); 
	
	public List<Account> Login(String UserName,String Password);
	
}
