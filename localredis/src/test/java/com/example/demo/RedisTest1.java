package com.example.demo;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import java.time.LocalDateTime;

import org.junit.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dto.Point;
import com.example.demo.repository.PointRedisRepository;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest1 {
	
    @Autowired
    private PointRedisRepository pointRedisRepository;
    

    @After
    public void tearDown() throws Exception {
        pointRedisRepository.deleteAll();
    }
    
    @Test
    public void 기본_등록_조회기능() {
        //given
        String id = "jojoldu";
        LocalDateTime refreshTime = LocalDateTime.of(2018, 5, 26, 0, 0);

        pointRedisRepository.save(Point.builder()
                .id(id)
                .amount(1000L)
                .refreshTime(refreshTime)
                .build());

        //then
        Point savedPoint = pointRedisRepository.findById(id).get();
        
        System.out.println("======= 1111 ============================================");
        System.out.println("id ====> " + savedPoint.getId());
        System.out.println("amount ====> " + savedPoint.getAmount());
        System.out.println("refreshTime====> " + savedPoint.getRefreshTime());        
        
        savedPoint.refresh(2000L, LocalDateTime.now());
        pointRedisRepository.save(savedPoint);
        
        
        System.out.println("======= 2222 ============================================");
        System.out.println("id ====> " + savedPoint.getId());
        System.out.println("amount ====> " + savedPoint.getAmount());
        System.out.println("refreshTime====> " + savedPoint.getRefreshTime());
        
        
        

    }

}
