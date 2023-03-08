/**
 * 
 */
package com.day15.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.day6.inheritance.Emp;

/**
 * @author Rama Krishna M
 *
 */
public class ProductStreamsExampleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		productsList.add(new Product(6, "SAMSUNG", 40000f));
		productsList.add(new Product(7, "SAMSUNG", 40000f));

		

		System.out.println("1........Fetching Product price more than 30k.............................");
		                                //all details                40K>30K
		List<Float> productPriceList2 = productsList.stream().filter(p -> p.price > 30000)// filtering data
				.map(p -> p.price)   // fetching price
				.collect(Collectors.toList()); // 
		System.out.println(productPriceList2);

		System.out.println("2........Fetching Product Name and Product ID equal to 30k.................");
		// This is more compact approach for filtering data
		productsList.stream().filter(product -> product.price == 30000).forEach(
				product -> System.out.println("ProductID:= " + product.id + "\n" + "ProductName:= " + product.name));

		System.out.println("3........Fetching Product name and ID the  price more than 30k..............");
		productsList.stream().filter(p -> p.price > 30000).collect(Collectors.toList()).forEach(
				product -> System.out.println("ProductID:= " + product.id + "\n" + "ProductName:= " + product.name));

		System.out.println("4.......Display the  total price of laptops....................................");
		double total = productsList.stream().collect(Collectors.summingDouble(product -> product.price));
		System.out.println("Total Value of price :=" + total);

		System.out.println("5.......Find Avg price of laptops...............................................");
		double avg = productsList.stream().collect(Collectors.averagingDouble(product -> product.price));
		System.out.println("Avag price of laptop:=" + avg);
		
		System.out.println("6.......Find Max and Min price of laptops............................................");
		Product minPrice=productsList.stream().collect(Collectors.minBy(Comparator.comparingDouble(Product::getPrice))).get();
		System.out.println("Min Price of Laptaob:= "+minPrice.price );
		
		Optional<Product> maxPrice=productsList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Product::getPrice)));
		System.out.println("Max Price of Laptaob:= "+maxPrice.get().price );
		
		System.out.println("7.......Get the count based on productNames ?............................................");
		Map<String, Long> count=productsList.stream().collect(Collectors.groupingBy(Product::getName,Collectors.counting()));
		
		System.out.println(count);
		
		System.out.println("8.......Find Count of Each Brands of laptops based on Price ............................................");
		Map<Float, Long> count1=productsList.stream().collect(Collectors.groupingBy(Product::getPrice,Collectors.counting()));
		
		System.out.println(count1);

		List list=new ArrayList();
		
	
		
		
		

	}

}
