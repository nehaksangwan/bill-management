package com.bill.management.billManagement.com.bill.management.billManagement;

import java.awt.List;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.stereotype.Service;

@Service
public class BillService {

	private static List names = (List) Arrays.asList(new BillService());
	public static List main(String[] args) {
		// TODO Auto-generated method stub
		return names;
		
	}
	public List getnames() {
		return names;
	}
	
	public Object getnames(String id) {
		return extracted().stream().filter(t -> t.getnames().equals(id)).findFirst().get();
	}
	private Collection<BillService> extracted() {
		return (Collection<BillService>) names;
	}
	
}
