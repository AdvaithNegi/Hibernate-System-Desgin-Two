package com.jsp.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate.dto.Product;

public class ProductDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// Insert Record
	public Product saveProduct(Product product) {
		if (product != null) {
			entityTransaction.begin();
			entityManager.persist(product);
			entityTransaction.commit();
			return product;
		} else
			return null;
	}

	// Get By Id Record
	public Product getByIdProduct(int id) {
		return entityManager.find(Product.class, id);
	}

	// Update Record
	public Product updateProduct(Product product) {
		if (product != null) {
			entityTransaction.begin();
			entityManager.merge(product);
			entityTransaction.commit();
			return product;
		} else
			return null;
	}

	// Delete Record
	public Product deleteProduct(Product product) {
		if (product != null) {
			entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
			return product;
		} else
			return null;
	}

	// Get All Records
	public void getAllProducts() {
		String sql = "select p from Product p";
		Query query = entityManager.createQuery(sql);
		List<Product> products = query.getResultList();
		for (Product product : products) {
			System.out.println("================================================");
			System.out.println("Product ID    : " + product.getId());
			System.out.println("Product Name  : " + product.getName());
			System.out.println("Product Price : " + product.getPrice());
		}
	}

}
