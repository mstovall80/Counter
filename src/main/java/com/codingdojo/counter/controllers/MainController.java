package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("/counter")
	public String counter( HttpSession session) {
		Integer count = (Integer) session.getAttribute("count" );
		if(count == null) {
		session.setAttribute("count", 0);
		count = 0;
		}
		count ++;
		session.setAttribute("count", count);
		session.getAttribute("count");
		return "counter.jsp";
		
	}
	


}

