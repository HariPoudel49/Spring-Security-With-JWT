package com.sec.jwt;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {
	
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)
			throws IOException, ServletException {
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		response.setContentType("application/json");
		
		Map<String, Object> errorResponse = new HashMap<>();
		errorResponse.put("status", HttpStatus.NOT_ACCEPTABLE.value());
		errorResponse.put("error", "the provided token is incorrect ");
		errorResponse.put("message", authException.getMessage());
		
		ObjectMapper objectMapper = new ObjectMapper();
		PrintWriter writer = response.getWriter();
		
		// JSON with specific order
		writer.println("{ \"status\": " + errorResponse.get("status") +
				", \"error\": \"" + errorResponse.get("error") +
				"\", \"message\": \"" + errorResponse.get("message") + "\" }");
	}
}
