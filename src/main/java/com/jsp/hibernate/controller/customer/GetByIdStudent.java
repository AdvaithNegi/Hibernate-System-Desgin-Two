package com.jsp.hibernate.controller.customer;

import com.jsp.hibernate.dto.Customer;
import com.jsp.hibernate.service.CustomerService;

public class GetByIdStudent {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerService();
		Customer customer = customerService.getByIdCustomer(4);

		if (customer != null) {
			System.out.println("Customer Id    : " + customer.getId());
			System.out.println("Customer Name  : " + customer.getName());
			System.out.println("Customer Email : " + customer.getEmail());
			System.out.println("Customer CNo   : " + customer.getCno());
		}

	}

}
