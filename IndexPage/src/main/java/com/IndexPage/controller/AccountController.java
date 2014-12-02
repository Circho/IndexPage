package com.IndexPage.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.IndexPage.DAO.AccountDAO;
import com.IndexPage.model.Account;



/**
 *  this controller contain the page for account
 * @author huangyuan
 *
 */
@Controller
public class AccountController {
	@Autowired
	private AccountDAO accountDao;
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String Login( @ModelAttribute("Login") Account account,
			Model model,HttpSession session) {		
		
		List<Account> list= accountDao.Login(account.getUserName(), account.getPassword());
		
		session.setAttribute("IsLogin", list.get(0));
		return "redirect:/";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String addAccount( @ModelAttribute("register") Account account,
			Model model) {		
		
			account.setLevel(1);
			accountDao.register(account);
		
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model)
	{
		model.addAttribute("register", new Account()); 
		
		return "register";
	}

}
