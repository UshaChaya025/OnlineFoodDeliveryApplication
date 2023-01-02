package com.cg.ofda.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.ofda.dto.CustomerDto;
import com.cg.ofda.dto.RestaurantDto;
import com.cg.ofda.repository.ICustomerRepository;
@Service
public class ICustomerServiceImpl implements ICustomerService {
	@Autowired
	ICustomerRepository customerRepository;

	/* @author : Swetha
	 * @return : Customer 
	 * @description : This method adds customer to the repository and returns customer
	 */
	@Override
	public CustomerDto addCustomer(CustomerDto customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		return customer;
	}

	/* @author : Swetha
	 * @return : Customer 
	 * @description : This method updates customer to the repository and returns customer
	 */
	@Override
	public CustomerDto updateCustomer(CustomerDto customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		return customer;
	}

	/* @author : Swetha
	 * @return : Customer 
	 * @description : This method removes customer to the repository and returns customer
	 */
	@Override
	public CustomerDto removeCustomer(CustomerDto customer) {
		// TODO Auto-generated method stub
		customerRepository.delete(customer);
		return customer;
	}
	
	/* @author : Swetha
	 * @return : Customer 
	 * @description : This method gets customer to the repository and returns customer
	 */

	@Override
	public CustomerDto viewCustomer(String custId) {
		// TODO Auto-generated method stub
		return customerRepository.findById(custId).get();
	}

	@Override
	public List<CustomerDto> viewAllCustomers(RestaurantDto rest) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<CustomerDto> viewAllCustomers() {
		List<CustomerDto> crts = customerRepository.findAll();
		return crts;
	}
 
	
	
}
