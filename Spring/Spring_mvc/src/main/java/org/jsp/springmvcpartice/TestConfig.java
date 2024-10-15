package org.jsp.springmvcpartice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestConfig {
	
	@RequestMapping(value = "/test-config")
	@ResponseBody
	public String test()
	{
		return "<h1>this handler is created to test the configurtion</h1>";
	}
	
	@RequestMapping(value="/open-home")
	
	public String openhomepage()
	{
		System.out.println("!!!!!!!");
		return "home";
	}
	
	@RequestMapping(value = "/open-findsum")
	public String openfindsum()
	{
		return "Findsum";
	}
	
	@RequestMapping(value = "/sum")
	public String getsum(@RequestParam(name="n1")int n1, @RequestParam(name="n2")int n2, Model Model)
	{
		String result =n1+"+ "+n2+"+ "+"="+(n1+n2);
		Model.addAttribute("res", result);
		return "print";
	}
	
	@RequestMapping(value="/open-register")
	public ModelAndView openregisterpage()
	{
		ModelAndView v= new ModelAndView();
		v.setViewName("register");
		v.addObject("user",new User());
		
		return v;
	}

	@RequestMapping(value = "/register")
	@PostMapping
	@ResponseBody
	public String getRegister(@ModelAttribute(name="user") User user)
	{
		return user.toString();
	}
}
