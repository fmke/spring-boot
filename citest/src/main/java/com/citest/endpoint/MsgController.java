package com.citest.endpoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	@RequestMapping(value="/msg", method=RequestMethod.GET)
	public String sendMsg(@RequestParam(name="msg") String msg,
			HttpServletRequest request, 
	        HttpServletResponse response) {
		
		System.out.println(request.getRequestURI());
		
		return msg;
	}
	
	@RequestMapping(value="/authCb", method=RequestMethod.GET)
	public void authCb(@RequestParam(name="authCb") String msg,
			HttpServletRequest request, 
	        HttpServletResponse response) {
		
		System.out.println(request.getRequestURI());
		System.out.println(request.getQueryString());
	}
}
