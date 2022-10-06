package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/userlogin.htm")
	public ModelAndView login(@RequestParam("userName") String userName) {
		ModelAndView mav = new ModelAndView();
		
		if (userName.equals("Albin")) {
			System.out.println("Login method called..");
			String msg = "Hi "+ userName + "! Have a wonderful evening :)";
			mav.addObject("MSG", msg);
			mav.setViewName("welcome.jsp");	
		}
		else {
			mav.addObject("MSG", "Invalid USER");
			mav.setViewName("login.jsp");
		}
		return mav;
	}
	
	@RequestMapping("/calculate.htm") 
	public ModelAndView login(@RequestParam("fno") int fno, @RequestParam("sno") int sno, @RequestParam("op") String operator) {
		ModelAndView mav = new ModelAndView();
		int res = 0;
		
		if(operator.equals("ADD")) {
			res = fno + sno;
		}
		else if(operator.equals("SUB")) {
			res = fno - sno;
		}
		else if(operator.equals("DIV")) {
			res = fno / sno;
		}
		else if(operator.equals("MUL")) {
			res = fno * sno;
		}
		else {
			res = 0;
		}
		
		mav.addObject("Result", res);
		mav.setViewName("CalcIndex.jsp");	
		
		return mav;
	}
}
