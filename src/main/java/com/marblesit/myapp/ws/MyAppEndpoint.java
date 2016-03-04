package com.marblesit.myapp.ws;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.marblesit.myapp.v1_0_0.GetMemberRequest;
import com.marblesit.myapp.v1_0_0.GetMemberResponse;

@Endpoint
public class MyAppEndpoint {

	@PayloadRoot(localPart="GetMemberRequest", namespace="http://marblesit.com/myapp/V1_0_0")
	public @ResponsePayload GetMemberResponse getMember(@RequestPayload GetMemberRequest request) {
		GetMemberResponse response = new GetMemberResponse();
		response.setName("Cory");
		return response;
	}

}
