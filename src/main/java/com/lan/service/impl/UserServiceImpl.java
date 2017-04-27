package com.lan.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lan.dao.UserMapper;
import com.lan.model.User;
import com.lan.page.Page;
import com.lan.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper mapper;

	@Override
	public Page findPage(Page page) {
		List<User> list = mapper.findPage(page);
		page.setData(list);
		return page;
	}

}
