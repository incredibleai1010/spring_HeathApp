package com.heath.app.controller;

import java.util.List;

import com.heath.app.pojo.AuthResponse;
import com.heath.app.pojo.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import com.heath.app.model.UserLoginData;
import com.heath.app.pojo.StringResponce;
import com.heath.app.service.UserDataService;

import com.heath.app.util.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UserDataController {

	@Autowired
	private UserDataService userDataService;
	@Autowired
	private AuthenticationManager authManager;

	@Autowired
	private JwtUtil jwtUtil;

	@GetMapping("/admin/getUserData")
	public List<UserLoginData> getUser() {

		return userDataService.getUser();
	}

	@PostMapping("/public/chkLogin")
	public ResponseEntity<?> chkLogin(@RequestBody UserLogin userLogin) {

		Authentication auth = authManager.authenticate(
				new UsernamePasswordAuthenticationToken(userLogin.getUserId(), userLogin.getPasswrd()));
		String token = jwtUtil.generateToken(userLogin.getUserId());
		return ResponseEntity.ok(new AuthResponse(token));

		//return userDataService.chkLogin(userLogin);
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
