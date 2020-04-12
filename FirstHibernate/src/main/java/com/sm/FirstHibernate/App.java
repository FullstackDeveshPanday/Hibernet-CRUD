package com.sm.FirstHibernate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

//import com.Devesh.Demohib.First;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
       // System.out.println( "Hello World!" );
    	
    	FirstName obj = new FirstName();
    	
    	System.out.println("Enter Details In Very Truly Manner.....");
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter Roll no ....");
    	int rollno=Integer.parseInt(br.readLine());
    	obj.setEmpid(rollno);
    	System.out.println("Enter Name Of Student.....");
    	String name=br.readLine();
    	obj.setEmpname(name);
    	System.out.println("Enter Phone No.....");
    	int phone=Integer.parseInt(br.readLine());
    	obj.setPhone(phone);
    	System.out.println("Enter Address Of Home....");
    	String address=br.readLine();
    	obj.setEmpadd(address);
    	
    	Configuration cn= new Configuration().configure().addAnnotatedClass(FirstName.class);
    	ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(cn.getProperties()).buildServiceRegistry();
    	SessionFactory sf=cn.buildSessionFactory(sr);
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(obj);
    	System.out.println("Enter id What you get details......");
    	int id =Integer.parseInt(br.readLine());
    	obj= (FirstName)session.get(FirstName.class, id);
    	tx.commit();
    	System.out.println(obj);
    	
    }
}
