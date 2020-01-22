package com.robomq.Day2Training.Assignment;

import java.util.Comparator;

public class SortByName implements Comparator<Book>{

	@Override
	public int compare(Book c1, Book c2) {
		String name1=c1.getMemberName();
		String name2=c2.getMemberName();
		int r=name1.compareTo(name2);
		return r;
	}

}
