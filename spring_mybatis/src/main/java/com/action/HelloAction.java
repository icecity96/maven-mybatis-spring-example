package com.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.AuthorMapper;
import com.service.AuthorService;
@Controller
public class HelloAction {
	@Autowired
	AuthorMapper authorService;
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name", authorService.getUser("0000000001").toString());
		return "welcome";
	}
}
