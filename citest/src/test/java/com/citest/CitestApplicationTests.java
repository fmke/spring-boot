package com.citest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.citest.endpoint.MsgController;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CitestApplicationTests {

	@Autowired
	private MsgController msgController;
	
	
	@Test
	public void contextLoads() {
		
		 assertThat(msgController).isNotNull();
	}

}
