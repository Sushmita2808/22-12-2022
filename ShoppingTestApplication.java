package com.shopping.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shopping.demo.controller.CategoryController;
import com.shopping.demo.controller.ProductController;
import com.shopping.demo.model.Category;
import com.shopping.demo.model.Product;


@SpringBootApplication
public class ShoppingTestApplication implements CommandLineRunner {
	
	@Autowired
	private ProductController productController;
	
	@Autowired
	private CategoryController categoryController;


	public static void main(String[] args) {
		SpringApplication.run(ShoppingTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("\n\n*********Categories Records***********");
		addCategories(createCategories());
		
		System.out.println("\n\n*********Products Records***********");
		addProducts(createProducts());
		
		
	}
	
	
		private void addCategories(List<Category> categories) {
			for (Category category : categories) {
				categoryController.save(category);
				
			}
		}
		
		private void addProducts(List<Product> products) {
			for (Product product : products) {
				productController.save(product);
				
			}
		}
			
		private List<Category> createCategories() {
			
			//create object
					
			Category category1= new  Category(1,"Foods","Collection of tasty and yummy foods",null);
			Category category2= new  Category(2,"Soft Drinks","Give refreshments",null);
			Category category3= new  Category(3,"Clothes","This includes shirts,sweaters,jeans ,etc.. ",null);
			Category category4= new  Category(4,"Foods and Drinks","Delious , fresh and tasty  .",null);
						

							
			//add in list
			List<Category> category= new ArrayList<>();
			category.add(category1);
			category.add(category2);
			category.add(category3);
			category.add(category4);
					
			return category;
			

		}

		
		private List<Product> createProducts() {
			
			//create object
					
			Product product1 = new  Product(1,"Maggie Noddles ",80.56,25,true,null);		
			Product product2 = new  Product(2,"Maaza ",48.8,25,true,null);		
			Product product3 = new  Product(3,"Tropicana ",59.78,25,true,null);		
			Product product4 = new  Product(4,"Yippee Noodles ",45.68,25,true,null);		
			Product product5 = new  Product(5,"Jeans ",1000.5,25,true,null);		
			Product product6 = new  Product(6,"Sweater",2489.8,25,true,null);		
			Product product7 = new  Product(7,"Jackets ",3000.80,25,true,null);		

							
			//add in list
			List<Product> products= new ArrayList<>();
			products.add(product1);
			products.add(product2);
			products.add(product3);
			products.add(product4);
			products.add(product5);
			products.add(product6);
			products.add(product7);
					
			return products;
			

		}
}
