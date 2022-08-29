package org.test.learning.service;

import org.test.learning.model.User;

public class LoginService {

	public boolean verifylogin(User user) {
		if(user.getUserId().equals("userId") && user.getPassword().equals("password")) {
			return true;
		}
		return false;
	}
}
