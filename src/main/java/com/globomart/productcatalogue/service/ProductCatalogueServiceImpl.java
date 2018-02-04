package com.globomart.productcatalogue.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globomart.productcatalogue.model.Product;
import com.globomart.productcatalogue.repository.ProductCatalogueRepository;

@Service
public class ProductCatalogueServiceImpl implements ProductCatalogueService{
	
	@Autowired
	private ProductCatalogueRepository repository;

	@Override
	@Transactional
	public void addProduct(List<Product> productList) {
		repository.save(productList);
	}

	@Override
	@Transactional
	public void removeProduct(Long productId) {
		repository.delete(productId);		
	}

	@Override
	@Transactional
	public List<Product> getProductsByType(String productType) {
		return repository.getProductsByType(productType);
	}

	@Override
	@Transactional
	public List<Product> getProductsByName(String productName) {
		return repository.getProductsByName(productName);
	}

	@Override
	public List<Product> getProductsByBrand(String productBrand) {
		return repository.getProductsByBrand(productBrand);
	}

}
