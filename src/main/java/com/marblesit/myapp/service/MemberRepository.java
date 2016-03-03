package com.marblesit.myapp.service;

import org.springframework.data.repository.CrudRepository;

import com.marblesit.myapp.entity.Member;

public interface MemberRepository extends CrudRepository<Member, Long> {

}
