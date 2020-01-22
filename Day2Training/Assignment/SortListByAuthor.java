package com.robomq.Day2Training.Assignment;

import java.util.Comparator;

public class SortListByAuthor implements Comparator<Book>{

	@Override
	public int compare(Book a1, Book a2) {
		String name1=a1.getAuthor();
		String name2=a2.getAuthor();
		int r=name1.compareTo(name2);
		return r;
	}

}
