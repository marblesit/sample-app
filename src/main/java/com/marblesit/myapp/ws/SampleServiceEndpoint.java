package com.marblesit.myapp.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.marblesit.myapp.entity.Member;
import com.marblesit.myapp.service.SampleService;
import com.marblesit.myapp.v1_0_0.GetMemberRequest;
import com.marblesit.myapp.v1_0_0.GetMemberResponse;

@Endpoint
public class SampleServiceEndpoint {
	
	@Autowired
	private SampleService service;

	@PayloadRoot(localPart="GetMemberRequest", namespace="http://marblesit.com/myapp/V1_0_0")
	public @ResponsePayload GetMemberResponse getMember(@RequestPayload GetMemberRequest request) {
		
		Member member = service.getMember(request.getId());
		
		GetMemberResponse response = new GetMemberResponse();
		response.setName(member.getName());
		return response;
	}

}
