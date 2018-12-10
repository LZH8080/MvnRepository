package com.zeasn.view;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zeasn.service.UsersService;

@Controller
public class UsersController {
	@Resource
	private UsersService usersServiceImpl;
	@RequestMapping("selAll")
	public String selAll(Model model) {
		model.addAttribute("list", usersServiceImpl.selAll());
		return "index.jsp";
	}
}
