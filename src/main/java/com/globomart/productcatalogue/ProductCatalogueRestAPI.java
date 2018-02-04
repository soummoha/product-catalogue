package com.globomart.productcatalogue;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globomart.productcatalogue.model.Product;
import com.globomart.productcatalogue.service.ProductCatalogueService;
import com.globomart.productcatalogue.util.ProductCatalogueUtil;

@Component
@RestController
@RequestMapping("/globomart")
public class ProductCatalogueRestAPI {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductCatalogueRestAPI.class);
	
	@Autowired
	private ProductCatalogueService service;
	
	@PostMapping("/products")
	@Consumes(MediaType.APPLICATION_JSON)
	public String addProducts(@RequestBody String productJson){
		List<Product> productList = null;
		try {
			productList = ProductCatalogueUtil.parseJson(productJson);
		} catch (JSONException e) {
			logger.error("error occured while adding products to catalogue!");
			return "error occured while adding products to catalogue!";
		}
		service.addProduct(productList);
		logger.debug("products added to catalogue successfully!");
		return "products added to catalogue successfully!";
	}
	
	@DeleteMapping("/product/{productId}")
	public String deleteProduct(@PathVariable("productId") long productId){
		service.removeProduct(productId);
		logger.debug("product deleted from catalogue successfully!");
		return "productId = "+ productId +" deleted from catalogue successfully!";
	}
	
	@GetMapping("/product/type/{productType}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProductsByType(@PathVariable("productType") String productType){
		return service.getProductsByType(productType);
	}
	
	@GetMapping("/product/name/{productName}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProductsByName(@PathVariable("productName") String productName){
		return service.getProductsByName(productName);
	}
	
	@GetMapping("/product/brand/{productBrand}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProductsByBrand(@PathVariable("productBrand") String productBrand){
		return service.getProductsByBrand(productBrand);
	}
}
