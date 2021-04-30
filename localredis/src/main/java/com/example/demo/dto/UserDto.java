package com.example.demo.dto;

import org.springframework.data.annotation.Id;

import com.example.demo.core.masking.MaskType;
import com.example.demo.core.masking.Maskable;

import lombok.Builder;
import lombok.Data;

@Data
public class UserDto{
	
	@Id
	private String id;
	
	@Maskable(MaskType.my012)
	private String jumin;
	
	private String dummy;
	
/*	
	
	@Builder
	public UserDto(String id,String jumin,String dummy) {
		this.id = id;
		this.jumin = jumin;
		this.dummy = dummy;
	}
*/
}
