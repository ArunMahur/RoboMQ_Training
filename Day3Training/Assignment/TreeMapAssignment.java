package com.robomq.Day3Training.Assignment;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import com.robomq.exception.Student;

public class TreeMapAssignment {

	public static void main(String[] args) {
		
		TreeMap<String, BookAuthorDetails> tm=new TreeMap<String, BookAuthorDetails>();
		
		tm.put("Core Java", new BookAuthorDetails(1,"arun","jaipur"));
		tm.put("Advance Java", new BookAuthorDetails(2,"hits","jaipur"));
		tm.put("Angular", new BookAuthorDetails(3,"daulat","jaipur"));
		tm.put("Html", new BookAuthorDetails(1,"arun","jaipur"));
		tm.put("CSS", new BookAuthorDetails(2,"hits","jaipur"));
		tm.put("python", new BookAuthorDetails(4,"suraj","jaipur"));
		
		Collection<BookAuthorDetails> values=tm.values();
		System.out.println("print values of treemap ::\n\n"+ values);
		
		Set<String> keys=tm.keySet();
		System.out.println("\n print keys of treemap ::\n\n"+ keys);
		
		//first solution of assignment question1
		Iterator<String> iterator=tm.keySet().iterator();
		while(iterator.hasNext()) {
			String key=iterator.next();
			System.out.println("\n key: "+key + ", value :: "+tm.get(key));
		
		}
	
		//Second Solution of assignment question 1
		int size=tm.size();
		String arr[]=new String[size];
		int j=0;
		
		for(String i:keys)
		{
		   BookAuthorDetails a=tm.get(i);
		   Function obj=new Function();
		   obj.Display(i, a.getAuthor_name(), a.getAddress());
		   
		   arr[j]=a.getAuthor_name();
		   j++;
		   
		}
		Function obj1=new Function();
		obj1.count_All(arr);
	/*	Set<Integer> keys=students.keySet();
		String grade=null;
		for(Integer i:keys) {
			
			Student s=students.get(i);
			if(s.getMarks()>300) {
				grade="A";
			}
			
			else if(s.getMarks()<300 && s.getMarks()>250){
				grade="B";
			}
			else
				grade="C";
			
			System.out.println(s.getName()+" Scored :: "+grade+" grade in current semester");
		}*/
	}
}
