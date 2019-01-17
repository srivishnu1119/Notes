package com.cg.pl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.entites.ModuleBean;

public class JPQLMain {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		String sql = "SELECT total FROM trainee_details  WHERE details_Id=21";
		TypedQuery<ModuleBean> query = (TypedQuery<ModuleBean>) em.createQuery(sql);
		em.getTransaction().begin();
		ModuleBean dis = (ModuleBean) query.getSingleResult();
		System.out.println("id = "+dis.getDetails_Id());
		System.out.println("total = "+dis.getTotal());
		em.getTransaction().commit();
	}
		
}
