package com.lan.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lan.page.Page;
import com.lan.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("findPage")
	@ResponseBody
	public Page findPage(Page page) {
		return userService.findPage(page);
	}
}
