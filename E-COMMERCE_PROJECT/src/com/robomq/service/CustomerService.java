package com.robomq.service;

import java.sql.ResultSet;

import com.robomq.pojo.Customer;

public interface CustomerService {

	public boolean createCustomer(Customer c);
	public ResultSet displayCustomer(int id);
	public boolean login(int id,String name);
	public boolean updateCustomer(int id,String email, String address, String mobile); 
	public boolean deleteCustomer(int id);
}
