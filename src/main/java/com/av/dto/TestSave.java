package com.av.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lathesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Subject subject=new Subject();
		subject.setName("ATC");
		subject.setDuration(10);
		Subject subject2=new Subject();
		subject2.setName("OS");
		subject2.setDuration(9);
		List<Subject> list=new ArrayList<Subject>();
		list.add(subject);
		list.add(subject2);
		
		
		Teacher teacher=new Teacher();
		teacher.setName("Sowmya");
		teacher.setSalary(15000);
		teacher.setSubject(list);
		Teacher teacher2=new Teacher();
		teacher2.setName("Ganesh");
		teacher2.setSalary(20000);
		teacher2.setSubject(list);
		List<Teacher> list2=new ArrayList<Teacher>();
		list2.add(teacher);
		list2.add(teacher2);
		subject.setList(list2);
		subject2.setList(list2);
		entityTransaction.begin();
		entityManager.persist(subject);;
		entityManager.persist(subject2);;
		entityManager.persist(teacher);;
		entityManager.persist(teacher2);;
		entityTransaction.commit();
		
		
		

	}

}
