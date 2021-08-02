package com.SpringBootAssignment.TargetRetailServicesMaven.services;

import java.util.List;

import com.SpringBootAssignment.TargetRetailServicesMaven.entities.Products;


public interface productServices {
	
	public List <Products> getProducts();
	
	public Products getProduct(long productId);
	
//	public Products addProduct(Products product);
	
//	public UpdateProducts updatePrice(long productId ,UpdateProducts product);
	
	public Products put(long productId, Products product);
}
