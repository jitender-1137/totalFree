package com.totalFree.totalFree.service;

import javax.validation.Valid;

import com.totalFree.totalFree.dto.UserDto;

public interface UserService {

	UserDto addUser(@Valid UserDto userDto);

}
