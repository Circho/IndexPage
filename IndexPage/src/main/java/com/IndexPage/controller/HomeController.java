package com.IndexPage.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.IndexPage.DAO.AccountDAO;
import com.IndexPage.model.Account;

/**
 * Home controller only the post and get for "/"
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
		//List<Account> accounts=accountDao.findAllOrderedByName();
		//model.addAttribute("accounts", accounts); 
		return "home";
	}
	
}
