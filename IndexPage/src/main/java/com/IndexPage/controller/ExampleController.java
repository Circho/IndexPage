package com.IndexPage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author huangyuan
 *
 */
@Controller
public class ExampleController {
	
	
	
	/**
	 *test dojo 
	 */
	@RequestMapping(value = "/dojo/", method = RequestMethod.GET)
	public String DOJO()
	{
		return "dojo";
	}
	
	

}
