package com.robomq.pojo;

public class Product {

	private int p_id;
	private String p_name, discription;
	private  int price;
	
	public Product() {
		
	}
	public Product(int p_id, String p_name, String discription, int price) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.discription = discription;
		this.price = price;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", p_name=" + p_name + ", discription=" + discription + ", price=" + price
				+ "]";
	}
	
	
}
