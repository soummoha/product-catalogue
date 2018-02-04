package com.globomart.productcatalogue.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.globomart.productcatalogue.model.Product;

public class ProductCatalogueUtil {
	
	public static final List<Product> parseJson(String productListJson) throws JSONException{	
	    JSONObject jsonObj = new JSONObject(productListJson);	    
	    JSONArray jsonArray = jsonObj.getJSONArray("product");
	    List<Product> productList = new ArrayList<>();
	    for( int i = 0; i < jsonArray.length(); i++ ){
	    	Product prod = new Product();
	    	prod.setProductDesc(jsonArray.getJSONObject(i).getString("productDesc"));
	    	prod.setProductBrand(jsonArray.getJSONObject(i).getString("productBrand"));
	    	prod.setProductName(jsonArray.getJSONObject(i).getString("productName"));
	    	prod.setProductType(jsonArray.getJSONObject(i).getString("productType"));
	    	prod.setProductPrice(BigDecimal.valueOf(Double.valueOf(jsonArray.getJSONObject(i).getString("productPrice"))));
	    	prod.setProductDiscount(Integer.valueOf(jsonArray.getJSONObject(i).getString("productDiscount")));
	    	productList.add(prod);
	    }
		return productList;
	}
}
