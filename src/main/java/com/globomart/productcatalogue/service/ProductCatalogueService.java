package com.globomart.productcatalogue.service;

import java.util.List;

import com.globomart.productcatalogue.model.Product;

public interface ProductCatalogueService {
	
	void addProduct(List<Product> productList);
	
	void removeProduct(Long productId);
	
	List<Product> getProductsByType(String productType);
	
	List<Product> getProductsByName(String productName);
	
	List<Product> getProductsByBrand(String productBrand);
	

}
