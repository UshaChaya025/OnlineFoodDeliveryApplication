package com.cg.ofda.service;

import java.util.List;

import com.cg.ofda.dto.CustomerDto;
import com.cg.ofda.dto.RestaurantDto;

public interface ICustomerService {
	
	public CustomerDto addCustomer(CustomerDto customer);
	public CustomerDto updateCustomer(CustomerDto customer);
	public CustomerDto removeCustomer(CustomerDto customer);
	public CustomerDto viewCustomer(String custId);
	public List<CustomerDto> viewAllCustomers();
	public List<CustomerDto> viewAllCustomers(RestaurantDto rest);

}
