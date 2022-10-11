package com.av.dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAllTeacherAndSubject {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lathesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select t from Teacher t");
		List<Teacher> list=query.getResultList();
		for(Teacher subject:list)
		{
			System.out.println("Teacher id       :"+subject.getId());
			System.out.println("Teacher Name     :"+subject.getName());
			System.out.println("Teacher Salary   :"+subject.getSalary());
			List<Subject> list2=subject.getSubject();
			for(Subject subject2:list2)
			{
				System.out.println("Subject id         :"+subject2.getId());
				System.out.println("Subject Name       :"+subject2.getName());
				System.out.println("Subject Duration   :"+subject2.getDuration());
				System.out.println("************************************************");
			}
			System.out.println("************************************************");
		}

	}

}
