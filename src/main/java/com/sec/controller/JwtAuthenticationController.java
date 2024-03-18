package com.sec.controller;

import com.sec.exceptionHandler.Invalid;
import com.sec.jwt.JwtHelper;
import com.sec.jwt.JwtRequest;
import com.sec.jwt.JwtResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class JwtAuthenticationController {
	private UserDetailsService userDetailsService;
	private AuthenticationManager manager;
	private JwtHelper helper;
	
	@PostMapping("/api/v1/login")
	public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest request){
		//authenticate
		this.doAuthenticate(request.getUsername(), request.getPassword());
		UserDetails userDetails= userDetailsService.loadUserByUsername(request.getUsername());
		String token = this.helper.generateToken(userDetails);
		JwtResponse response =JwtResponse.builder()
				.jwtToken(token)
				.username(userDetails.getUsername())
				.build();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	private void doAuthenticate(String username, String password){
		UsernamePasswordAuthenticationToken authentication  = new UsernamePasswordAuthenticationToken(username, password);
		try {
			manager.authenticate(authentication);
		}catch (BadCredentialsException e){
			throw new Invalid("Credentials Invalid !!");
		}
	}
}
