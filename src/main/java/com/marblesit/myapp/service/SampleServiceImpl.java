package com.marblesit.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marblesit.myapp.entity.Member;

@Service
public class SampleServiceImpl implements SampleService {
	
	@Autowired
	private MemberRepository repo;

	@Override
	public Member getMember(long id) {
		return repo.findOne(id);
	}

}
