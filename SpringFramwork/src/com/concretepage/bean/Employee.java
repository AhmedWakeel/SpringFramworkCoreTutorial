package com.concretepage.bean;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Employee 
{
	@Resource(name="company")
	private Company company;
	
//	@Resource(name="address")
	@Autowired
	@Qualifier("address1")
	private Address addressddd;
	
	public Company getCompany() 
	{
		return company;
	}
	public Address getAddressddd() 
	{
		return addressddd;
	}
	
	
	
	/*	@Resource
		private Company company;
		@Resource
		private Address address;
		public Company getCompany() {
			return company;
		}
		public Address getAddress() {
			return address;
		}*/
	} 
