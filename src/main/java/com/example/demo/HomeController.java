package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("add")
	public ModelAndView demo(@RequestParam("num1") int i, @RequestParam("num2") int j) {
//		int i = Integer.parseInt(request.getParameter("num1"));
//		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i+j;
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", k);
		mv.setViewName("home.jsp");
		return mv;
	}
}
