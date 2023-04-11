package com.jsp.hibernate.controller.customer;

import com.jsp.hibernate.service.CustomerService;

public class GetAllCustomers {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerService();
		customerService.getAllCustomers();

	}

}
