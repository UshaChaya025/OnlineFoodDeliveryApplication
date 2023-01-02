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

import com.cg.ofda.dto.CustomerDto;
import com.cg.ofda.service.ICustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	ICustomerServiceImpl customerService;
	
	@GetMapping("/hello")
		public String getMessage() {
			return "hi";
		}
	
	@PostMapping("/addCustomer")
	public CustomerDto addCustomer(@RequestBody CustomerDto customer) {
		return customerService.addCustomer(customer);
	}
	
	@PutMapping("/updateCustomer")
	public CustomerDto updateCustomer(@RequestBody CustomerDto customer) {
		return customerService.updateCustomer(customer);
	}
	
	@GetMapping("/viewCustomer/{id}")
	public CustomerDto viewCustomer(@PathVariable("id") String id) {
		return customerService.viewCustomer(id);
	}
	@DeleteMapping("/removeCustomer")
	public CustomerDto removeCustomer(@RequestBody CustomerDto customer) {
		
		return customerService.removeCustomer(customer);
	}
	
	@GetMapping("/viewallcustomer")
	public List<CustomerDto> viewAllCustomers(){
		return customerService.viewAllCustomers();
	}
}
