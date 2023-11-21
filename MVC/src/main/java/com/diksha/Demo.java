 package com.diksha;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.Service;

@Controller
public class Demo {
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int a, @RequestParam("t2") int b,HttpServletRequest request, HttpServletResponse response) {
//		int a=Integer.parseInt(request.getParameter("t1"));
//		int b=Integer.parseInt(request.getParameter("t2"));
		Service s=new Service();
		int c=s.add(a,b);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("view");
		mv.addObject("result",c);   
		return mv;
		
	}

}