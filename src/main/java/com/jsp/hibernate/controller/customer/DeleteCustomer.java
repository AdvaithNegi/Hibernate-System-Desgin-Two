package com.jsp.hibernate.controller.customer;

import com.jsp.hibernate.dto.Customer;
import com.jsp.hibernate.service.CustomerService;

public class DeleteCustomer {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerService();
		Customer customer = customerService.deleteCustomer(6);
		if (customer != null)
			System.out.println("Customer Record Deleted");
	}

}
