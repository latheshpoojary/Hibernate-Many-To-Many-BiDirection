package com.av.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateTeacher {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lathesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Teacher teacher=entityManager.find(Teacher.class, 2);
		teacher.setName("sharan");
		teacher.setSalary(25000);
		entityTransaction.begin();
		entityManager.merge(teacher);;
		entityTransaction.commit();


	}

}
