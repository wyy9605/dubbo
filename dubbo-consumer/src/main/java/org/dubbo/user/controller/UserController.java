package org.dubbo.user.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.dubbo.user.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Reference
	private IUserService userService;
	@GetMapping("hello")
	public String hello() {
		return userService.name();
	};
}
