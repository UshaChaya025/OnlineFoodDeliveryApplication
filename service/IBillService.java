package com.cg.ofda.service;

import com.cg.ofda.dto.BillDto;

public interface IBillService {
	
	public BillDto addBill(BillDto bill);
	public BillDto updateBill(BillDto bill);
	public BillDto removeBill(BillDto bill);
	public double calculateTotalCost(String billId);

}
