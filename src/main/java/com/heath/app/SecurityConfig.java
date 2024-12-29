package com.heath.app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	//@Autowired
	//private CustomUserDetailsService userDetailsService;
	
//	public UserDetailsServiceAutoConfiguration userSrvice() {
//		
//		UserDetails normalUser = User.withUsername() 
//		return null;
//		
//	}
//	
	
	
	@Bean 
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable()
		.authorizeHttpRequests(authorize -> authorize
		.requestMatchers("/api/public/**").permitAll() // Permit access to login and register endpoints 
		.requestMatchers("/admin/**").hasRole("ADMIN") // Only ADMIN can access /admin/** 
		.requestMatchers("/user/**").hasRole("USER") // Only USER can access /user/**
		
		.anyRequest().authenticated() // All other endpoints require authentication
		).httpBasic(); // Enable basic authentication (or use formLogin for form-based authentication)
		return httpSecurity.build();
	}
}
