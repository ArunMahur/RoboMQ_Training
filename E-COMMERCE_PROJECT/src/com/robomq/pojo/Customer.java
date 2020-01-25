package com.robomq.pojo;

public class Customer {

	private int id;
	private String name,email,address;
	private String mobile;
	
	public Customer() {
		
	}

	public Customer(int id, String name, String email, String address, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", mobile="
				+ mobile + "]";
	}
	
	
}
