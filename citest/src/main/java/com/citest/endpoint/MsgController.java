package com.citest.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	@RequestMapping(value="/msg", method=RequestMethod.GET)
	public String sendMsg(@RequestParam(name="msg") String msg) {
		
		return msg;
	}
}
