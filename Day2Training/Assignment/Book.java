package com.robomq.Day2Training.Assignment;

public class Book {

	private  int MemberId;
	private String MemberName;
	private String Author;
	private String Publisher;
	private int Quantity;
	
	public Book() {}
	public Book(int MemberId,String MemberName, String Author, String Publisher, int Quantity) {
	
		this.MemberId=MemberId;
		this.MemberName=MemberName;
		this.Author=Author;
		this.Publisher=Publisher;
		this.Quantity=Quantity;;
	}
	
	public int getMemberId() {
		return MemberId;
	}
	public void setMemberId(int memberId) {
		MemberId = memberId;
	}
	public String getMemberName() {
		return MemberName;
	}
	public void setMemberName(String memberName) {
		MemberName = memberName;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n  MemberId :: "+MemberId+", Member Name :: "+MemberName+", Auhtor :: "+Author+", Publisher :: "+Publisher+", Quantity :: "+Quantity+" ;";
	}
}
