package org.dubbo.user.service;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class UserServiceImpl implements IUserService{

	@Override
	public String name() {
		return "dubbo-provider";
	}

}
