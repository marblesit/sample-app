package com.marblesit.myapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marblesit.myapp.entity.Member;
import com.marblesit.myapp.service.MyAppService;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class MyController {
	
	@Autowired
	private MyAppService service;

	/*
	 * URL http://localhost:8080/myapp/rest/member/1
	 */
	@RequestMapping(path="/member/{id}", method=RequestMethod.GET)
	public @ResponseBody String getMemeber(@PathVariable long id) {
		Member member = service.getMember(id);
		return member.getName();
	}
}
