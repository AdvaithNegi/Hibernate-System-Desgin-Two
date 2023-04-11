package com.jsp.hibernate.controller.product;

import com.jsp.hibernate.service.ProductService;

public class GetAllProducts {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		productService.getAllProducts();

	}
}
