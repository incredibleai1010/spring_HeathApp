package com.heath.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heath.app.model.UserData;
import com.heath.app.pojo.StringResponce;
import com.heath.app.pojo.UserLogin;
import com.heath.app.service.UserDataService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UserDataController {

	@Autowired
	private UserDataService userDataService;
	@GetMapping("/admin/getUserData")
	public List<UserData> getUser() {
		return userDataService.getUser();
	}
	@PostMapping("/public/chkLogin")
	public StringResponce chkLogin(@RequestBody UserLogin userLogin) {
		return userDataService.chkLogin(userLogin);
	}
	@PostMapping("/public/signup")
	public StringResponce signUp(@RequestBody UserData useData) {
		return userDataService.signUp(useData);
	}
	
}
