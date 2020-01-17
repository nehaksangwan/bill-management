package com.bill.management.billManagement.com.bill.management.billManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bill {
	
	@Autowired
	private BillService billService;
	
	@RequestMapping("/names")
	public java.awt.List getnames(){
		return billService.getnames();
	}
	@RequestMapping("/names/{id}")
	public BillService getnames(@PathVariable String id) {
		return (BillService) billService.getnames(id);
	} 
	
}
