package com.heath.app.controller;

import java.util.List;

import com.heath.app.pojo.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.heath.app.model.UserLoginData;
import com.heath.app.pojo.StringResponce;
import com.heath.app.service.UserDataService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UserDataController {

	@Autowired
	private UserDataService userDataService;
	@GetMapping("/admin/getUserData")
	public List<UserLoginData> getUser() {

		return userDataService.getUser();
	}

	@PostMapping("/public/chkLogin")
	public StringResponce chkLogin(@RequestBody UserLogin userLogin) {
		return userDataService.chkLogin(userLogin);
	}

	@PostMapping("/public/signup")
	public StringResponce signUp(@RequestBody UserLoginData useData) {
		return userDataService.signUp(useData);
	}
	@GetMapping("/public/getUserById/{id}")
	public UserLoginData getUserById(@PathVariable int id) {
		return userDataService.getUserById(id);
	}
	@PostMapping("/public/saveUser")
	public void saveUser(@RequestBody UserLoginData useData) {
		userDataService.saveUser(useData);
	}
	@DeleteMapping("/public/deleteUser")
	public void deleteUser(@RequestBody int id) {
		userDataService.deleteUser(id);
	}
	
}
