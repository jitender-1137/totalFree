package com.totalFree.totalFree.service;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalFree.totalFree.dao.UserDao;
import com.totalFree.totalFree.dto.UserDto;
import com.totalFree.totalFree.model.UserModel;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public UserDto addUser(@Valid UserDto userDto) {
		UserModel user =new UserModel();
//		BeanUtils.copyProperties(userDto, user);
		user.setId(userDto.getId());
		user.setEmail(userDto.getEmail());
		System.out.println(user.getClass());
		return null;
	}

}
