package com.IndexPage.controller;


import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.IndexPage.DAO.AccountDAO;
import com.IndexPage.model.Account;

/**
 * controller
 * @author huangyuan
 *
 */
@Controller
public class HomeController {

	@Autowired
	private AccountDAO accountDao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("Login", new Account()); 
		List<Account> accounts=accountDao.findAllOrderedByName();
		model.addAttribute("accounts", accounts); 
		
		
		
		return "home";
	}
	
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
