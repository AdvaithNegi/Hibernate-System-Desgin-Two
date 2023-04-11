package com.jsp.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate.dto.Customer;

public class CustomerDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// Insert Record
	public Customer saveCustomer(Customer customer) {
		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
		return customer;
	}

	// Get Record By ID
	public Customer getByIdCustomer(int id) {
		return entityManager.find(Customer.class, id);
	}

	// Update Record
	public Customer updateCustomer(Customer customer) {
		if (customer != null) {
			entityTransaction.begin();
			entityManager.merge(customer);
			entityTransaction.commit();
			return customer;
		} else
			return null;
	}

	// Delete Record
	public Customer deleteCustomer(Customer customer) {
		if (customer != null) {
			entityTransaction.begin();
			entityManager.remove(customer);
			entityTransaction.commit();
			return customer;
		} else
			return null;
	}

	// Get All Record
	public void getAllCustomers() {
		String sql = "select c from Customer c";
		Query query = entityManager.createQuery(sql);
		List<Customer> customers = query.getResultList();
		for (Customer customer : customers) {
			System.out.println("========================================================");
			System.out.println("Customer ID    : " + customer.getId());
			System.out.println("Customer Name  : " + customer.getName());
			System.out.println("Customer Email : " + customer.getEmail());
			System.out.println("Customer CNO   : " + customer.getCno());
		}
	}

}
