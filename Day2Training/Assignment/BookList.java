package com.robomq.Day2Training.Assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;


public class BookList {

	public static void main(String[] args) {
		
		ArrayList<Book> bk=new ArrayList<Book>();
		
		bk.add(new Book(1,"meven","kaithy Serra","robomq",2));
		bk.add(new Book(2,"string","Mr.Bachhan","teramera",7));
		bk.add(new Book(3,"java","BIg B","yourPublication",1));
		bk.add(new Book(4,"arun","k*","myPublication",15));
		bk.add(new Book(5,"python","dr.birla","k* publishor",5));
		
		System.out.println(bk);
		
		Iterator itr=bk.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Select the way you want to sort in the books details:: \n press 1 for memberid:: \n press 2 for name:: \n press 3 for author:: \n press 4 for publisher:: \n press 5 for quantity :: \n press 6 to exit" );
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1: System.out.println("\n SOrted list by id");
		        SortById id=new SortById();
		        bk.sort(id);
		        System.out.println(bk);
		        break;
		
		case 2: System.out.println("\n Sorted list BY name");
		        SortByName nm=new SortByName();
		        bk.sort(nm);
		        System.out.println(bk);
		        break;
		
		case 3: System.out.println("\n SOrted list by auhtor");
	            SortListByAuthor au=new SortListByAuthor();
	            bk.sort(au);
	            System.out.println(bk);
	            break;
	    
		case 4: System.out.println("\n Sorted list by publisher");
	            SortByPublisher pb=new SortByPublisher();
	            bk.sort(pb);
	            System.out.println(bk);
	            break;
	    
		case 5: System.out.println("\n SOrted list by quantity");
	            SortByQuantity qt=new SortByQuantity();
	            bk.sort(qt);
	            System.out.println(bk);
	            break;
	            
		case 6: break;
		
		default: System.out.println("You have entered a wrong choice \n");
		          break;
		}
	}

}
