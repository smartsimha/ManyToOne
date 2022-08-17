package com.tysspl.many_to_one_uni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tysspl.many_to_one_uni.dto.Product;
import com.tysspl.many_to_one_uni.dto.Review;

public class SaveProduct {

	public static void main(String[] args) {
		Product product1=new Product();
		product1.setName("Ear Buds");
		product1.setBrand("Boat");
		product1.setCost(1200);
		
		Product product2=new Product();
		product2.setName("Shoes");
		product2.setBrand("Nike");
		product2.setCost(4500);
		
		Product product3=new Product();
		product3.setName("T-shirt");
		product3.setBrand("Levis");
		product3.setCost(1200);
		
		Review review1=new Review();
		review1.setUserName("Tommy");
		review1.setDescription("Sound quality is good");
		review1.setProduct(product1);
		
		Review review2=new Review();
		review2.setUserName("vicky");
		review2.setDescription("Very light weight");
		review2.setProduct(product2);
		
		Review review3=new Review();
		review3.setUserName("bublu");
		review3.setDescription("Best earbuds at this price and  sound quality is have to improve");
		review3.setProduct(product1);
		
		Review review4=new Review();
		review4.setUserName("simha");
		review4.setDescription("Sound quality is good");
		review4.setProduct(product1);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(product1);
		entityManager.persist(product2);
		entityManager.persist(product3);
		entityManager.persist(review1);
		entityManager.persist(review2);
		entityManager.persist(review3);
		entityManager.persist(review4);
		entityTransaction.commit();
		System.err.println("*************************Saved*************************");
	}

}
