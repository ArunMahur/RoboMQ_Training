package com.robomq.Day3Training.Assignment;

import java.util.HashSet;

public class ElectionMap {

	public static void main(String[] args) {
	HashSet<Election> election = new HashSet<Election>();
	
	election.add(new Election(1, "abc", "11", "jaipur", "hawa mahal", "13"));
	election.add(new Election(2, "jj", "13", "bundi", "fort", "13"));
	election.add(new Election(3, "ijknk", "11", "kota", "kst", "16"));
	election.add(new Election(4, "jknklnl", "12", "ajmer", "mosque", "19"));
	election.add(new Election(5, "fch", "13", "bikaner", "junaghar", "15"));
	
	System.out.println(election);
	}

}
