package com.zeasn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zeasn.bean.Users;
import com.zeasn.mapper.UsersMapper;
import com.zeasn.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{
	@Resource
	private UsersMapper usersMapper;
	@Override
	public List<Users> selAll() {
		return usersMapper.selAll();
	}

}
