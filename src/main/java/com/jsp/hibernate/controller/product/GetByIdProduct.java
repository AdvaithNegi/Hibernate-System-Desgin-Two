package com.jsp.hibernate.controller.product;

import com.jsp.hibernate.dto.Product;
import com.jsp.hibernate.service.ProductService;

public class GetByIdProduct {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		Product product = productService.getByIdProduct(4);

		if (product != null) {
			System.out.println("Product ID    : " + product.getId());
			System.out.println("Product Name  : " + product.getName());
			System.out.println("Product Price : " + product.getPrice());
		}
	}
}
