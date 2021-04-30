package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.demo.core.response.ResponseBase;
import com.example.demo.service.CustomerService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("v1/customer")
@AllArgsConstructor
public class CustomerController {
	
	private final CustomerService service;
	
	@GetMapping("/agreement")
	public ResponseBase<Object> selectAgreement(@RequestHeader(value="x-mask-auth",required = false) final String maskYn) {
		
		
		return ResponseBase.of(service.selectAgreement());
	}

}
