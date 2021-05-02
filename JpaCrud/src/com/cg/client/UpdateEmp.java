package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.entity.Emp;

public class UpdateEmp {

	public static void main(String[] args) {
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em=fac.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try {
			tx.begin();
			Emp emp=em.find(Emp.class, 1004);
			emp.setEmpSal(70000.0);
			//em.merge(emp);
			
			tx.commit();
		}
		catch(Exception e){
			if(tx != null)
				tx.rollback();
			
		}
		fac.close();
		System.out.println("table created");

	}

}
