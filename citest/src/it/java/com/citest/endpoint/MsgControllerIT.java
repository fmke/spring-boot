package com.citest.endpoint;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import static org.assertj.core.api.Assertions.assertThat;

public class MsgControllerIT {

	RestTemplate restTemplate = new RestTemplate();
	
	@Test
	public void testSendMsg() {
		ResponseEntity<String> response
		  = restTemplate.getForEntity("http://localhost:8082/citest/msg?msg=testSendMsg", String.class);
		
		assertThat(response.getBody()).isEqualTo("testSendMsg");
	}
}
