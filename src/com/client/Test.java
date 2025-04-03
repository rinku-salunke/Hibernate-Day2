package com.client;

import org.hibernate.Session;

import com.config.HibernateUtil;
import com.model.Student;

public class Test {

	public static void main(String[] args) {

		
		//Student s=new Student();
		
		
//		s.setRollno(4);
//		s.setName("jit");
		
		Session se=HibernateUtil.getSessionFactory().openSession();
		
		//se.persist(s);//save method is in Hibernate 5.X version , now in 6.X we use persist() instead of save
		
		//se.beginTransaction().commit();
		
		Student s=se.load(Student.class, 4);
		
		System.out.println(s.getRollno());
		
		//System.out.println(s.getName());
		
		
		
	}

}
