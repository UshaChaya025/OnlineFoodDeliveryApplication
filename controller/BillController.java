package com.cg.ofda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ofda.dto.BillDto;
import com.cg.ofda.service.IBillServiceImpl;

@RestController
	@RequestMapping("/bill")
	public class BillController {
		@Autowired
		IBillServiceImpl ibillService;
		
		@PostMapping("/addbill")
		public BillDto addBill(@RequestBody BillDto bill) {
			return ibillService.addBill(bill);
		}
		@PutMapping("/updatebill")
		public BillDto updateBill(@RequestBody BillDto bill) {
			return ibillService.updateBill(bill);
		}
		@DeleteMapping("/removebill")
		public BillDto removeBill(BillDto bill) {
			return ibillService.removeBill(bill);
		}
		@GetMapping("/viewallbills")
		public List<BillDto> viewBills(){
		return ibillService.viewBills();
		}
		
		@GetMapping("/calculateTotalCost/{id}")
		public double calculateTotalCost(@PathVariable("id") String billId) {
			return ibillService.calculateTotalCost(billId);
		}
		


}
