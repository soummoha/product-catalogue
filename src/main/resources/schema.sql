create table if not exists PRODUCT
(
   PRODUCT_ID identity,
   PRODUCT_NAME varchar(255) not null,
   PRODUCT_TYPE varchar(255) not null,
   PRODUCT_BRAND varchar(255) not null,
   PRODUCT_PRICE decimal(10, 2) not null,
   PRODUCT_DISCOUNT integer,
   PRODUCT_DESC varchar(255),
);