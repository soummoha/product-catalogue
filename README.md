# product-catalogue
The Product Catalogue - Spring Boot Application

## Pre-requisite
jdk 1.8 or higher\
maven 3.x or higher

## Database
The application uses h2 embedded database

### Schema
create table if not exists PRODUCT\
(\
   PRODUCT_ID identity,\
   PRODUCT_NAME varchar(255) not null,\
   PRODUCT_TYPE varchar(255) not null,\
   PRODUCT_BRAND varchar(255) not null,\
   PRODUCT_PRICE decimal(10, 2) not null,\
   PRODUCT_DISCOUNT integer,\
   PRODUCT_DESC varchar(255)\
);

## Usage
Run the application as spring boot application

### Add products (httpMethod=POST)
http://host:8080/globomart/products

#### RequestBody
```
{
	"product": [{
		"productDesc": "Running Shoe",
		"productDiscount": "10",
		"productName": "Footwear",
		"productPrice": "2800",
		"productType": "Men's wear",
		"productBrand": "Provogue"
	},
	{
		"productDesc": "Stretchable Jeans",
		"productDiscount": "15",
		"productName": "Jeans",
		"productPrice": "3200",
		"productType": "Women's wear",
		"productBrand": "Wrangler"
	},
	{
		"productDesc": "Long Gown",
		"productDiscount": "0",
		"productName": "Dresses",
		"productPrice": "1400",
		"productType": "Women's wear",
		"productBrand": "Vero Moda"
	}]
}
```
### Delete product (httpMethod=DELETE)
http://host:8080/globomart/product/1

### Retrieve product based on product type (httpMethod=GET)
http://host:8080/globomart/product/type/women's wear

### Retrieve product based on product name (httpMethod=GET)
http://host:8080/globomart/product/name/footwear

### Retrieve product based on product brand (httpMethod=GET)
http://host:8080/globomart/product/brand/wrangler
