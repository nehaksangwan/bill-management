package com.bill.management.billManagement.com.bill.management.billManagement;

import java.util.ArrayList;
import java.util.List;

public class MyListArr {
	public static void main(String[] args) {
		List<String> e = new ArrayList<String>();
		e.add("Suchita");
		e.add("Vikash");
		e.add("Deepak");
		e.add("Charu");
		e.add("Preeti");
		String[] str = new String[1];
		str = e.toArray(str);
		for (String s : str) {
			System.out.println(s);
			}
		}
	
}
