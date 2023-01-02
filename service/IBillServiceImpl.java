package com.cg.ofda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ofda.dto.BillDto;
import com.cg.ofda.repository.IBillRepository;
@Service
public class IBillServiceImpl implements IBillService{

	@Autowired
	IBillRepository ibillRepository;
	
	/* @author : Eurekha *
	 *  @return : Bill *
	 *   @description : This method adds the Bill in the repository and returns Bill */
	@Override
	public BillDto addBill(BillDto bill) {
		return ibillRepository.save(bill);
	}
	
	/* @author : Eurekha *
	 *  @return : Bill *
	 *   @description : This method updates the Bill in the repository and returns Bill */
	@Override
	public BillDto updateBill(BillDto bill) {
			return ibillRepository.save(bill);
	}

	
	/* @author : Eurekha *
	 *  @return : Bill *
	 *   @description : This method deletes the Bill from the repository and returns Bill */
	@Override
	public BillDto removeBill(BillDto bill) {
		String billId = bill.getBillid();
		BillDto billdto = ibillRepository.findById(billId).get();
		ibillRepository.delete(bill);
		return billdto;
	}
	
	
	/* @author : Eurekha *
	 *  @return : Bill *
	 *   @description : This method updates the Bill in the repository and returns Bill */
		
	public List<BillDto> viewBills(){

		return ibillRepository.findAll();

		}

	@Override
	public double calculateTotalCost(String billId) {
	BillDto bill = ibillRepository.findById(billId).get();
		return bill.getTotalitem()*bill.getTotalcost();
	}
	

	

	

}
