package com.jsp.hibernate.controller.customer;

import com.jsp.hibernate.dto.Customer;
import com.jsp.hibernate.service.CustomerService;

public class UpdateCustomer {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setName("XYZ");
		customer.setEmail("xyz@email.com");
		customer.setCno(7788669933L);

		CustomerService customerService = new CustomerService();
		Customer customer2 = customerService.updateCustomer(customer, 5);
		if (customer2 != null)
			System.out.println("Customer Record Updated");
	}

}
