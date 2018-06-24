package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Data;

@Controller 
public class MyFirstController {

	
	@Autowired
    private Data d;

	
	
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String first() 
	{
		return "index";
	}	
	
	
	
	@RequestMapping(value="/logincheck",method = RequestMethod.POST)
	public String login3(Model model) 
	{
        model.addAttribute(new Data());
	
		System.out.println(model);
		
		return "index2";
	}	
	
	
	/*
	
	@RequestMapping(value="/logincheck",method = RequestMethod.POST)
	public String login3(@RequestParam String id,@RequestParam String pass) 
	{
		
		System.out.println(id);
		System.out.println(pass);
		
		
		
		return "index";
	}	*/
	
	@RequestMapping(value="/second",method = RequestMethod.GET)
	public String login2()
	{
		//@RequestParam String id,@RequestParam String pass
		return "index2";
	}	
	
}
