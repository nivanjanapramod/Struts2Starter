package org.test.learning.action;

import org.apache.commons.lang3.StringUtils;
import org.test.learning.model.User;
import org.test.learning.service.LoginService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void validate() {
		if (StringUtils.isEmpty(user.getUserId())) {
			addFieldError("userId", "User ID Cannot be blank");
		}
		
		if (StringUtils.isEmpty(user.getUserId())) {
			addFieldError("password", "Password Cannot be blank");
		}
	}
	
	public String execute() {
		LoginService loginService = new LoginService();
		
		if (loginService.verifylogin(user)) {
			return SUCCESS;
			}
		return LOGIN;
	}

}
