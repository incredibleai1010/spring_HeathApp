package com.heath.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.heath.app.dao.UserDatadao;
import com.heath.app.model.UserLoginData;
import com.heath.app.pojo.StringResponce;

@Service
public class UserDataServiceImpl implements UserDataService {
	@Autowired
	private UserDatadao userDataDao;
	
	@Transactional
	@Override
	public List<UserLoginData> getUser() {
		
		return userDataDao.getUser();
	}
	@Transactional
	@Override
	public UserLoginData getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public void saveUser(UserLoginData user) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public StringResponce chkLogin(com.heath.app.pojo.UserLogin userLogin) {
		
		return userDataDao.chkLogin(userLogin);
	}
	@Override
	public StringResponce signUp(UserLoginData user) {
		
		return userDataDao.signUp(user);
	}
}
