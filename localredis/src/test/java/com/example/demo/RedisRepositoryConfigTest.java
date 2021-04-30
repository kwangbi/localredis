package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisRepositoryConfigTest {

	@Autowired
	private StringRedisTemplate redisTemplate;
	
/*	
	@Test
	public void testString() {
		final String key="testString";
		final ValueOperations<String, String> stringValueOperration = redisTemplate.opsForValue();
		
		stringValueOperration.set(key, "1");
		final String result_1 = stringValueOperration.get(key);
		
		System.out.println("result_1 : " + result_1);
		
		stringValueOperration.increment(key);
		final String result_2 = stringValueOperration.get(key);
		
		System.out.println("result_2 : " + result_2);
		
	}
	
	@Test
	public void testList() {
		final String key = "keyList";
		
		final ListOperations<String, String> stringListOperations = redisTemplate.opsForList();
		
		stringListOperations.rightPush(key, "H");
		stringListOperations.rightPush(key, "e");
		stringListOperations.rightPush(key, "l");
		stringListOperations.rightPush(key, "l");
		stringListOperations.rightPush(key, "o");
		
		stringListOperations.rightPushAll(key, " ", "s", "a", "b", "a");
		
		final String character_1 = stringListOperations.index(key, 1);
		
		System.out.println("character_1 = " + character_1);
		
		final Long size = stringListOperations.size(key);
		
		System.out.println("size = " + size);
		
		final List<String> ResultRange = stringListOperations.range(key, 0, 9);
		
		System.out.println("ResultRange = " + Arrays.toString(ResultRange.toArray()));
		
	}
	
	
	@Test
	public void testHash() {
	    String key = "keyHash";

	    HashOperations<String, Object, Object> stringObjectObjectHashOperations = redisTemplate.opsForHash();

	    stringObjectObjectHashOperations.put(key, "Hello", "sabarada");
	    stringObjectObjectHashOperations.put(key, "Hello2", "sabarada2");
	    stringObjectObjectHashOperations.put(key, "Hello3", "sabarada3");

	    Object hello = stringObjectObjectHashOperations.get(key, "Hello");

	    System.out.println("hello = " + hello);

	    Map<Object, Object> entries = stringObjectObjectHashOperations.entries(key);

	    System.out.println("entries = " + entries.get("Hello2"));

	    Long size = stringObjectObjectHashOperations.size(key);

	    System.out.println("size = " + size);
	}
	
*/
	
	
	
	@Test
	public void testDummy() {
		String key="key";
		final ValueOperations<String, String> stringValueOperration = redisTemplate.opsForValue();
		
		for(int i=0;i<=100;i++) {
			//stringValueOperration.set(key + "_i", "value_" + i);
			stringValueOperration.set(key, "value_" + i);
		}
		
		Long size = stringValueOperration.size(key);
		
		System.out.println("size = " + size);
	}
}
