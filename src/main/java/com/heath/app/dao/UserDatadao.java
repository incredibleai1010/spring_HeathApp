package com.heath.app.dao;

import java.util.List;
import java.util.Optional;

import com.heath.app.model.UserLoginData;
import com.heath.app.pojo.StringResponce;
import com.heath.app.pojo.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDatadao {
	
	List<UserLoginData> getUser();
	UserLoginData getUserById(int id);
	void saveUser(UserLoginData user);
	void deleteUser(int id);
	public StringResponce chkLogin(UserLogin userLogin);
	public StringResponce signUp(UserLoginData user);


}
