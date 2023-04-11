package com.jsp.hibernate.controller.product;

import com.jsp.hibernate.dto.Product;
import com.jsp.hibernate.service.ProductService;

public class DeleteProduct {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		Product product = productService.deleteProduct(6);
		if (product != null)
			System.out.println("Product Record Deleted");
	}
}
