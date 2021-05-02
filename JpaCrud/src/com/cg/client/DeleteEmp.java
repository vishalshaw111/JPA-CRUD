package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.entity.Emp;

public class DeleteEmp {
	public static void main(String[] args) {
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em=fac.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Emp emp=em.find(Emp.class, 1004);
		em.remove(emp);
		tx.commit();
		em.clear();
		fac.close();
		System.out.println("removed");
}
}