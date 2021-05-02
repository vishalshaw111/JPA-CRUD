package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Emp;

public class ViewEmployee {
	public static void main(String[] args) {
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em=fac.createEntityManager();
		Emp emp=em.find(Emp.class, 1002);
		System.out.println(emp);
		//em.detach(emp);
		//em.clear();
		Emp emp2=em.find(Emp.class, 1002);
		System.out.println(emp2);
		em.close(); 
		fac.close();
	}
}
