package com.marblesit.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="members")
public class Member {

	@Id
	@Column(name="id")
	private Long id;

	@Column(name="first")
	private String first;

	@Column(name="middle")
	private String middle;

	@Column(name="last")
	private String last;

	public Member() {
		super();
	}

	public Member(Long id, String first, String middle, String last) {
		super();
		this.id = id;
		this.first = first;
		this.middle = middle;
		this.last = last;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return first + " " + middle + " " + last;
	}

	@Override
	public String toString() {
		return getName();
	}
}
