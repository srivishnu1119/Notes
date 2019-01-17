package com.cg.pl;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entites.ModuleBean;

public class CalcMarks {
	
	public static void main(String[] args) {
		ModuleBean moduleBean=new ModuleBean();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Trainee name");
		String trainee_Name=scan.next();
		moduleBean.setTrainee_name(trainee_Name);
		
		System.out.println("Enter Module name");
		String module_Name=scan.next();
		moduleBean.setModule_Name(module_Name);
		
		System.out.println("Enter MPT Score");
		int mpt_Score=scan.nextInt();
		moduleBean.setMpt_Marks(mpt_Score);
		
		System.out.println("Enter MTT Score");
		int mtt_Score=scan.nextInt();
		moduleBean.setMtt_Marks(mtt_Score);
		
		System.out.println("Enter Assignment Score");
		int Assignment_marks=scan.nextInt();
		moduleBean.setAssignment_Marks(Assignment_marks);
		
		int total=(int) ((mpt_Score*0.70)+(mtt_Score*0.15)+(Assignment_marks*0.15));
		moduleBean.setTotal(total);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(moduleBean);
		em.getTransaction().commit();
		System.out.println("Added in data base");
		em.close();
		factory.close();
		
		System.out.println("Total marks Obtained :"+total);
		
		
	}

}
