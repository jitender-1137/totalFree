package com.totalFree.totalFree.restController;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.totalFree.totalFree.dto.ResponseDto;
import com.totalFree.totalFree.dto.SuccessResponseDto;
import com.totalFree.totalFree.dto.UserDto;
import com.totalFree.totalFree.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@Validated
@RequestMapping("/v1")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/addUser")
	public ResponseDto addUser(@Valid @RequestBody UserDto userDto) {
		
		UserDto userDtoResponse = userService.addUser(userDto);
		return new SuccessResponseDto(userDtoResponse, "Successfully added user");
	}
}
