package com.robomq.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.robomq.dbinfo.DBConnection;
import com.robomq.pojo.Customer;

public class CustomerServiceImpl implements CustomerService{

	Connection con;
	PreparedStatement pre;
	int ra;
	ResultSet res;
	boolean flag=false;
	
	public CustomerServiceImpl() {
		con=DBConnection.getConnection();
	}
	
	//Register a customer
	@Override
	public boolean createCustomer(Customer c) {
		try {
			   pre=con.prepareStatement("insert  into customer values(?,?,?,?,?)");
			   pre.setInt(1,c.getId());
			   pre.setString(2, c.getName());
			   pre.setString(3, c.getAddress());
			   pre.setString(4, c.getEmail());
			   pre.setString(5, c.getMobile());
			   
			   ra=pre.executeUpdate();
			   if(ra>0)
				   flag=true;
			   else
				   flag=false;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	// Login a customer
		public boolean login(int id, String name) {
			try {
				pre = con.prepareStatement("SELECT id,name FROM customer WHERE id=? AND name=?");
				pre.setInt(1, id);
				pre.setString(2, name);
				res = pre.executeQuery();
				if (res.next()) {
					return true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}

		// Display Customer Details
		public ResultSet displayCustomer(int id) {
			try {
				pre = con.prepareStatement("select * from customer where id=?");
				pre.setInt(1, id);
				res = pre.executeQuery();
				while (res.next()) {
					System.out.println("Customer Id:" + res.getInt("CID"));
					System.out.println("Customer Name:" + res.getString("Name"));
					System.out.println("Customer Email:" + res.getString("Email"));
					System.out.println("Customer Address:" + res.getString("Address"));
					System.out.println("Customer Mobile:" + res.getString("MobileNo"));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return res;
		}

		// Update Customer Details
		public boolean updateCustomer(int id, String email, String address, String mobile) {
			try {
				pre = con.prepareStatement("select * from customer where id=?");
				pre.setInt(1, id);
				res = pre.executeQuery();
				if (email.equalsIgnoreCase("no")) {
					while (res.next()) {
						email = res.getString("Email");
					}
				}
				res = pre.executeQuery();
				if (address.equalsIgnoreCase("no")) {
					while (res.next()) {
						address = res.getString("Address");
					}
				}
				res = pre.executeQuery();
				if (mobile.equalsIgnoreCase("no")){
					while (res.next()) {
						mobile = res.getString("MobileNo");
					}
				}
				pre = con.prepareStatement("Update customer set email=?,address=?,mobile=?  where id= ? ");
				pre.setString(1, email);
				pre.setString(2, address);
				pre.setString(3, mobile);
				pre.setInt(4, id);
				ra = pre.executeUpdate();
				if (ra > 0) {
					flag = true;
					System.out.println("Record Updated Successfully.");
				} else
					flag = false;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return flag;
		}

	// Deleting Customer Details
		public boolean deleteCustomer(int id) {
			try {
				pre = con.prepareStatement("delete from customer where id=?");
				pre.setInt(1, id);
				int ra = pre.executeUpdate();
				if (ra > 0)
					System.out.println("Record Deleted...");
				else
					System.out.println("Record has not Deleted...");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return flag;
		}

		
	
}
