package com.jsp.hibernate.controller.customer;

import com.jsp.hibernate.dto.Customer;
import com.jsp.hibernate.service.CustomerService;

public class SaveCustomer {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setName("abc");
		customer.setEmail("abc@mail.com");
		customer.setCno(7788554411L);

		CustomerService customerService = new CustomerService();
		Customer customer2 = customerService.saveCustomer(customer);
		if (customer2 != null)
			System.out.println(customer2.getName() + " added to database");
	}
}
