package com.robomq.Day2Training.Assignment;

import java.util.Comparator;

public class SortByQuantity implements Comparator<Book> {

	@Override
	public int compare(Book q1, Book q2) {
		int r=q1.getQuantity()-q2.getQuantity();
		return r;
	}

}
