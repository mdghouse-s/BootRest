package com.pro.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.pro.model.Product;

@Service
public class ProductService {
	
	private static Map<Integer, Product> productsDb = new HashMap<>();
	
	static{
		productsDb.put(101, new Product(101, "Laptop", 20000, "electronics"));
		productsDb.put(102, new Product(102, "Shirt", 750, "apparel"));
	}
	
	public List<Product> getProducts(){
		return new ArrayList<>(productsDb.values());
	}
	
	public Product getProduct(Integer prodCode){
		return productsDb.get(prodCode);
	}
	
	public Product insertProduct(Product prod){
		prod.setProductCode(Collections.max(productsDb.keySet()) + 100);
		productsDb.put(prod.getProductCode(), prod);
		return prod;
	}
	
	public Product deleteProduct(Integer prodCode){
		return productsDb.remove(prodCode);
	}
	
	public Product updateProduct(Product prod){
		productsDb.put(prod.getProductCode(),prod);
		return prod;
	}
	
	public List<Product> getProducts(String category){
		List<Product> allProducts = new ArrayList<>(productsDb.values());
		List<Product> categoryProducts = new ArrayList<>();
		for(Product p : allProducts ){
			if(p.getCategory().equals(category)){
				categoryProducts.add(p);
			}
		}
		return categoryProducts;
	}

}
