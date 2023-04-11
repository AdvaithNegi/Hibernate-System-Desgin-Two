package com.jsp.hibernate.service;

import com.jsp.hibernate.dao.CustomerDao;
import com.jsp.hibernate.dto.Customer;

public class CustomerService {

	CustomerDao customerDao = new CustomerDao();

	// Save Customer
	public Customer saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
	}

	// Get By Id Customer
	public Customer getByIdCustomer(int id) {
		return customerDao.getByIdCustomer(id);
	}

	// Update Customer
	public Customer updateCustomer(Customer customer, int id) {
		Customer customer2 = customerDao.getByIdCustomer(id);
		if (customer.getName() != null)
			customer2.setName(customer.getName());
		if (customer.getEmail() != null)
			customer2.setEmail(customer.getEmail());
		if (customer.getCno() != 0)
			customer2.setCno(customer.getCno());
		if (customer2 != null)
			return customerDao.updateCustomer(customer2);
		return null;
	}

	// Delete Customer
	public Customer deleteCustomer(int id) {
		Customer customer = customerDao.getByIdCustomer(id);
		if (customer != null)
			return customerDao.deleteCustomer(customer);

		return null;
	}

	// Get All Customers
	public void getAllCustomers() {
		customerDao.getAllCustomers();
	}

}
