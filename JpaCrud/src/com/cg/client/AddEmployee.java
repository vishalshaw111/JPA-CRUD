package com.cg.client;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.entity.Emp;

public class AddEmployee {
	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.setEmpId(1004);
		emp.setEmpName("Anand ghosh");
		emp.setEmpSal(45000.0);
		emp.setEmpDept("production");
		emp.setEmpDoj(LocalDate.of(2017, 04, 17));
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em=fac.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try {
			tx.begin();
			em.persist(emp);
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
