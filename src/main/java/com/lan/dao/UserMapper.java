package com.lan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lan.model.User;
import com.lan.page.Page;

public interface UserMapper {
	List<User> findPage(@Param("page") Page page);
}