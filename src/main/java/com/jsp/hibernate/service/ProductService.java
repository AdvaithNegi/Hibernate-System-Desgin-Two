package com.jsp.hibernate.service;

import com.jsp.hibernate.dao.ProductDao;
import com.jsp.hibernate.dto.Product;

public class ProductService {

	ProductDao productDao = new ProductDao();

	// Save Product
	public Product saveProduct(Product product) {
		return productDao.saveProduct(product);
	}

	// Get By Id Product
	public Product getByIdProduct(int id) {
		if (id > 0)
			return productDao.getByIdProduct(id);

		return null;
	}

	// Update Product
	public Product updateProduct(Product product, int id) {
		Product product2 = productDao.getByIdProduct(id);
		if (product.getName() != null)
			product2.setName(product.getName());
		if (product.getPrice() != 0)
			product2.setPrice(product.getPrice());
		if (product2 != null)
			return productDao.updateProduct(product2);
		return null;
	}

	// Delete Product
	public Product deleteProduct(int id) {
		Product product = productDao.getByIdProduct(id);
		if (product != null)
			return productDao.deleteProduct(product);

		return null;
	}

	// Get All Products
	public void getAllProducts() {
		productDao.getAllProducts();
	}
}
