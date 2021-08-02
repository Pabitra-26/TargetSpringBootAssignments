package com.SpringBootAssignment.TargetRetailServicesMaven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootAssignment.TargetRetailServicesMaven.entities.Products;
import com.SpringBootAssignment.TargetRetailServicesMaven.entities.UpdateProducts;
import com.SpringBootAssignment.TargetRetailServicesMaven.services.productServices;

@RestController
public class MyController {
	
	@Autowired
	private productServices ProductServices;
//	@GetMapping("/products")
//	public String products() {
//		return "This is products page";
//	}
	
	@GetMapping(path = "/products", produces = "application/json")
	public List<Products> getProducts(){
		return this.ProductServices.getProducts();
	}
	
	@GetMapping(path = "/products/{productId}", produces = "application/json")
	public Products getProduct(@PathVariable long productId) {
		return this.ProductServices.getProduct(productId);
	}
	
//	@PostMapping(path = "/products", consumes = "application/json")
//	public Products addProduct(@RequestBody Products product) {
//		return this.ProductServices.addProduct(product);
//	}
	
	@PutMapping(path = "/products/{productId}")
	   public Products put(@RequestBody UpdateProducts product, @PathVariable long productId) {
		Products stored = ProductServices.getProduct(productId);
		stored.setSellingPrice(product.getSellingPrice());
		stored.setDiscountedPrice(product.getSellingPrice()-(product.getSellingPrice()*(product.getDiscountPercent()/100)));
		return this.ProductServices.put(productId,stored);
//		return stored;
	}
//		return this.ProductServices.findById(productId)
//			      .map(employee -> {
//				        employee.setName(newEmployee.getName());
//				        employee.setRole(newEmployee.getRole());
//				        return repository.save(employee);
//				      })
//				      .orElseGet(() -> {
//				        newEmployee.setId(id);
//				        return repository.save(newEmployee);
//				      });
//	  }
}
