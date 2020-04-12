package com.caching.cacheExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Student s;
    	
    	Configuration cn= new Configuration().configure().addAnnotatedClass(Student.class);
    	ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(cn.getProperties()).buildServiceRegistry();
    	SessionFactory sf=cn.buildSessionFactory(sr);
    	Session session = sf.openSession();
    	session.beginTransaction();
    	//session.save();
    	
        s=(Student)session.get(Student.class,101);
    	
    	session.getTransaction().commit();
    	
    	System.out.println(s);
    	Session session1 = sf.openSession();
    	session1.beginTransaction();
    	//session.save();
    	
        s=(Student)session1.get(Student.class,101);
    	
    	session1.getTransaction().commit();
    	System.out.println(s);
    }
}
