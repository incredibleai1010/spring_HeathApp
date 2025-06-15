package com.heath.app.service;

import java.util.List;

import com.heath.app.model.UserLoginData;
import com.heath.app.pojo.StringResponce;

public interface UserDataService {
	List<UserLoginData> getUser();
	public StringResponce chkLogin(com.heath.app.pojo.UserLogin userLogin);
	public StringResponce signUp(UserLoginData user);
	UserLoginData getUserById(int id);
	void saveUser(UserLoginData user);
	void deleteUser(int id);
}
