package com.robomq.Day3Training.Assignment;

public class Function {

	public void Display(String s, String name, String addr) {
		
		System.out.println(s+" written by  "+name+" REsiding at "+ addr);
	}
	public void count_All(String arr[]) {
		
		String occurence="";
		
		int max=0;
		for(int y=0; y<arr.length;y++) {
			int count=0;
			for(int z=0;z<arr.length;z++) {
				if(arr[y]==arr[z]) {
					count++;
				}
			}
			if(count>=max) {
				max=count;
				occurence=arr[y];
			}
		}System.out.println(occurence);
	}
	
}
