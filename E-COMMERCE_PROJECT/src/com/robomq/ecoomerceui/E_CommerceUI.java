package com.robomq.ecoomerceui;

import java.util.Scanner;

import com.robomq.pojo.Customer;
import com.robomq.service.CustomerService;
import com.robomq.service.CustomerServiceImpl;

public class E_CommerceUI {
	
	Customer c;
	Scanner sc;
	CustomerService service;
	 
	public E_CommerceUI() {
		sc=new Scanner(System.in);
		c=new Customer();
		service=new CustomerServiceImpl();
	}
	public void registerCustomer() {
		System.out.println("ENter customer id");
		c.setId(sc.nextInt());
		
		System.out.println("enter customer name");
		c.setName(sc.next());
		
		System.out.println("enter customer email");
		c.setEmail(sc.next());
		
		System.out.println("enter customer address");
		c.setAddress(sc.next());
		
		System.out.println("enter customer MOBILE");
		c.setMobile(sc.next());
		
		if(service.createCustomer(c))
			System.out.println("Customer registered successfully!!!!");
		else
			System.out.println("CUstomer not registered!!!!");
	}
	
	public void loginCustomer() {
		System.out.println("Enter Customer id.");
		int cid = sc.nextInt();
		System.out.println("Enter Customer Name.");
		String name = sc.next();
		if (service.login(cid, name)) {
			System.out.println("Login Successfully");
			System.out.println("Your Details Stored with us:");
			service.displayCustomer(cid);
			System.out.println("Do you want to update details?(1.yes/2.no)");
			
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter New Customer email.(if don't want to update type no)");
				String email = sc.next();
				System.out.println("Enter New Customer address.(if don't want to update type no)");
				String address = sc.next();
				System.out.println("Enter New Customer Mobileno.(if don't want to update type 2)");
				String mobileno = sc.next();
				service.updateCustomer(cid, email, address, mobileno);
			} else
				System.exit(0);
		}

		else
			System.out.println("Incorrect Credentials..");
	}

	public void viewCustomer() {
		System.out.println("Enter Customer id.");
		int cid = sc.nextInt();
		service.displayCustomer(cid);
	}

	public void deleteCustomer() {
		System.out.println("Enter Customer id. to be deleted");
		int cid = sc.nextInt();
		service.deleteCustomer(cid);
	}

	public static void main(String[] args) {
		
          Scanner sc=new Scanner(System.in);
          String ch=null;
          E_CommerceUI e=new E_CommerceUI();
          while(true) {
        	  System.out.println("ENter your choice :: \n");
        	  System.out.println("1. Register new customer ");
        	  System.out.println("2. LOgin as new Custoemr");
        	  System.out.println("3. Print Customer Details");
  			  System.out.println("4. Delete a Customer");
        	  System.out.println("5. exit");
        	  ch=sc.next();
        	  
        	  switch (ch) {
			case "1":
				    e.registerCustomer();
				break;
			case "2":
				    e.loginCustomer();
				break;
            case "3":
				    e.viewCustomer();
				break;
            case "4":
				    e.deleteCustomer();
				break;
			case "5":
				  System.exit(0);
				break;
			default:
				break;
			}
          }
	}

}
