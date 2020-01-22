package com.robomq.Day2Training.Assignment;

import java.util.Comparator;

public class SortById implements Comparator<Book>{

	@Override
	public int compare(Book i1, Book i2) {
		
		int r=i1.getMemberId()-i2.getMemberId();
		return r;
	}

}
