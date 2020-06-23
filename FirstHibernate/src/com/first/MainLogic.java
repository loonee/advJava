package com.first;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		cf.configure("configure.xml");
		
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		
		Student x=new Student();
		x.setSid(1010);
		x.setSname("Sandy");
		x.setMarks(950);
		
		Transaction tx=se.beginTransaction();
		se.save(x);
		
		tx.commit();
		
		se.close();
		sf.close();
		 
		

	}

}
