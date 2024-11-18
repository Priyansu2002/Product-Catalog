package com.ecom.productcatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductCatalogApplication {

	public static void main(String[] args){
		System.setProperty("my_password", "root");
		SpringApplication.run(ProductCatalogApplication.class, args);
	}

}
