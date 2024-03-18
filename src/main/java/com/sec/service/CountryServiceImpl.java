package com.sec.service;

import com.sec.dto.CountryDto;
import com.sec.model.Country;
import com.sec.repository.CountryRepo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryServices{
	private final CountryRepo countryRepo;
	private final ModelMapper modelMapper;
	@Override
	public List<CountryDto> getAllCountry() {
		List<Country> countries= countryRepo.findAll();
		return countries.stream()
				.map(country ->modelMapper.map(country, CountryDto.class))
				.collect(Collectors.toList());
	}
}
