package org.creater.core.sys.controller;

import org.creater.api.sys.dto.LoginDto;
import org.creater.common.response.ResponseMessage;
import org.creater.core.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys")
public class SysController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	public ResponseMessage login(@RequestBody LoginDto loginDto) {
		return ResponseMessage.success(userService.login(loginDto));
	}
}
