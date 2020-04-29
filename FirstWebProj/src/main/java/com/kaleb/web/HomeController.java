package com.kaleb.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
//(@ReuestParameter("name") String name
@Controller
public class HomeController {
	//	@ResponseBody
	@RequestMapping("home")
public ModelAndView home( Alien alien /*@RequestParam("name") String myName *//* HttpSession  session HttpServletRequest request*/) {
	//	HttpSession session = request.getSession();
	//	String name = request.getParameter("name");
		ModelAndView mv = new ModelAndView();
		//session.setAttribute("name", myName);
		mv.addObject("obj", alien);
		mv.setViewName("home");
		return mv;
}
}
