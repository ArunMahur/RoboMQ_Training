package com.robomq.Day2Training.Assignment;

import java.util.Comparator;

public class SortByPublisher implements Comparator<Book> {

	@Override
	public int compare(Book p1, Book p2) {
		String name1=p1.getPublisher();
		String name2=p2.getPublisher();
		int r=name1.compareTo(name2);
		return r;
	}

}
