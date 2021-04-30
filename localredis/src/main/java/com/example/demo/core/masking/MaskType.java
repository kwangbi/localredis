package com.example.demo.core.masking;

import com.example.demo.core.masking.format.CitizenNumberFormat;

public enum MaskType {
	
	/** 주민등록번호(O) */
	my012(CitizenNumberFormat.INSTANCE);
	
	private MaskFormat<?> format;
	MaskType(final MaskFormat<?> format) {
		this.format = format;
	}

	public MaskFormat<?> getFormat(){
		return this.format;
	}

}
