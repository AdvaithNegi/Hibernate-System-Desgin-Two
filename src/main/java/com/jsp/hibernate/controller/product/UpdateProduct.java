package com.jsp.hibernate.controller.product;

import com.jsp.hibernate.dto.Product;
import com.jsp.hibernate.service.ProductService;

public class UpdateProduct {

	public static void main(String[] args) {

		Product product = new Product();
		product.setName("Lays");
		product.setPrice(40);

		ProductService productService = new ProductService();
		Product product2 = productService.updateProduct(product, 7);
		if (product2 != null)
			System.out.println("Product Record Updated");
	}

}
