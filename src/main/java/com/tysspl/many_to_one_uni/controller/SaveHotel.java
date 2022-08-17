package com.tysspl.many_to_one_uni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tysspl.many_to_one_uni.dto.Hotel;
import com.tysspl.many_to_one_uni.dto.Room;

public class SaveHotel {

	public static void main(String[] args) {
		Hotel hotel1 = new Hotel();
		hotel1.setName("taj");
		hotel1.setAddress("Mumbai");
		Hotel hotel2 = new Hotel();
		hotel2.setName("Babai Hotel");
		hotel2.setAddress("Vizag");

		Room room1 = new Room();
		room1.setCapacity(4);
		room1.setType("AC");
		room1.setHotel(hotel1);

		Room room2 = new Room();
		room2.setCapacity(2);
		room2.setType("normal");
		room2.setHotel(hotel1);

		Room room3 = new Room();
		room3.setCapacity(15);
		room3.setType("normal");
		room3.setHotel(hotel1);

		Room room4 = new Room();
		room4.setCapacity(6);
		room4.setType("normal");
		room4.setHotel(hotel2);

		Room room5 = new Room();
		room5.setCapacity(6);
		room5.setType("AC");
		room5.setHotel(hotel2);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(hotel1);
		entityManager.persist(hotel2);
		entityManager.persist(room1);
		entityManager.persist(room2);
		entityManager.persist(room3);
		entityManager.persist(room4);
		entityManager.persist(room5);
		entityTransaction.commit();
		System.err.println("*************************Done************************");

	}

}
