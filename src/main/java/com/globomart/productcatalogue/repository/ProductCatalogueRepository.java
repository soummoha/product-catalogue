package com.globomart.productcatalogue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.globomart.productcatalogue.model.Product;

public interface ProductCatalogueRepository extends JpaRepository<Product, Long> {
	
	@Query("SELECT p FROM Product p WHERE LOWER(p.productName) = LOWER(:productName)")
    public List<Product> getProductsByName(@Param("productName") String productName);

	@Query("SELECT p FROM Product p WHERE LOWER(p.productType) = LOWER(:productType)")
    public List<Product> getProductsByType(@Param("productType") String productType);
	
	@Query("SELECT p FROM Product p WHERE LOWER(p.productBrand) = LOWER(:productBrand)")
    public List<Product> getProductsByBrand(@Param("productBrand") String productBrand);
}
