package com.zeasn.start;

import com.zeasn.service.UserService;

public class UserStart implements UserService{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserStart uStart = new UserStart();
		uStart.start();
	}

	@Override
	public int start() {
		System.out.println("UserStart...");
		return 0;
	}

}
