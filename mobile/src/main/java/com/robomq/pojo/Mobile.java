package com.robomq.pojo;

public class Mobile {

	private int id;
	private String name,price, qty,desc;

	public Mobile() {
		
	}
	public Mobile(int id, String name, String price, String qty, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.desc = desc;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + ", desc=" + desc + "]";
	}

	
}
