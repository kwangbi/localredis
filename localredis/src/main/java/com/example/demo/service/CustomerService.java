package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.core.masking.MaskFilter;
import com.example.demo.core.masking.MaskType;
import com.example.demo.dto.UserDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerService {
	
	public UserDto selectAgreement() {
		
		
		UserDto dto = new UserDto();
		dto.setId("id");
		dto.setJumin("7510011109811");
		//dto.setJumin(MaskFilter.doFilter(MaskType.my012, "7510011109811"));
		dto.setDummy("dummy");
		
		return dto;
	}

}
