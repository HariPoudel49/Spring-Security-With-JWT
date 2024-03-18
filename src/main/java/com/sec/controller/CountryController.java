package com.sec.controller;

import com.sec.dto.CountryDto;
import com.sec.service.CountryServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
@RequiredArgsConstructor
public class CountryController {
	private final CountryServices countryServices;
	@GetMapping("countries")
	public ResponseEntity<List<CountryDto>> getAllCountry(){
		List<CountryDto> dtos =countryServices.getAllCountry();
		return new ResponseEntity<>(dtos, HttpStatus.FOUND);
	}
}
