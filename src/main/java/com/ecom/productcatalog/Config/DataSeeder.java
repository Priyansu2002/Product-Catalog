package com.ecom.productcatalog.Config;

import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.model.Product;
import com.ecom.productcatalog.repository.CategoryRepository;
import com.ecom.productcatalog.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //clear all existing data
        productRepository.deleteAll();
        categoryRepository.deleteAll();
        //create categories
        Category electronics=new Category();
        electronics.setName("Electronics");

        Category clothing=new Category();
       clothing.setName("Clothing");

        Category home=new Category();
        home.setName("Home and Kitchen");

        categoryRepository.saveAll(Arrays.asList(electronics,home,clothing));


        //create products
        Product phone=new Product();
        phone.setName("Smartphone");
        phone.setDescription("Latest smartphone with latest feature");
        phone.setImageUrl("https://placehold.co/600x400");
        phone.setPrice(999.99);
        phone.setCategory(electronics);



        Product laptop=new Product();
        laptop.setName("Laptop");
        laptop.setDescription("High performance laptop for work");
        laptop.setImageUrl("https://placehold.co/600x400");
        laptop.setPrice(1999.99);
        laptop.setCategory(electronics);


        productRepository.saveAll(Arrays.asList(phone,laptop));

        //committed successfully




    }
}
