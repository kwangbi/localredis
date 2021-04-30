package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dto.UserDto;


@RunWith(SpringRunner.class)
@SpringBootTest
public class maskingTest {
	
    @Test
    public void maskingtest() {
    	String id = "mask_id";
    	
    	
    	UserDto dto = new UserDto();
    	dto.setId(id);
    	dto.setJumin("7510011109811");
    	dto.setDummy("dummy data");
    	
    	System.out.println("jumin : " + dto.getJumin());
    	
    	
    	
    }

}
