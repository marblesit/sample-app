package com.marblesit.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="phone_numbers")
public class PhoneNumber {
	
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="number")
	private String number;

	@Override
	public String toString() {
		return number;
	}
}
