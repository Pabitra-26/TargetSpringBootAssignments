package com.SpringBootAssignment.TargetRetailServicesMaven.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringBootAssignment.TargetRetailServicesMaven.entities.Products;


@Service

public class productServicesImpl implements productServices{
	List <Products> list;
	
	public productServicesImpl() {
		
		list = new ArrayList<>();
		list.add(new Products(15117729,"Bread",45,"Own-Brand","online and store",10));
		list.add(new Products(15117730,"Bun",55,"External","store only",5));
		list.add(new Products(15117731,"CreamBun",30,"Own-Brand","unique online",20));
		list.add(new Products(15117732,"Cake",70,"Own-Brand","online and store",30));
		list.add(new Products(15117733,"Pastry",60,"External","store only",5));

	}

	@Override
	public List<Products> getProducts() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Products getProduct(long productId) {
		
		Products p = null;
		for (Products product : list ) {
			if(product.getProductId()==productId) {
				p = product;
				break;
			}
		}
		
		return p;
	}

	@Override
	public Products put(long productId, Products prod) {
		Products p = null;
		for (Products product : list ) {
			if(product.getProductId()==productId) {
				p = product;
				break;
			}
		}
		p= prod;

		
		return p;
	}

//	@Override
//	public Products addProduct(Products product) {
//		// TODO Auto-generated method stub
//		list.add(product);
//		return product;
//	}

}
