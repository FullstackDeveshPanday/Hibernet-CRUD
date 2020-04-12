package com.relhibe.FristHibrel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
        //System.out.println( "Hello World!" );
    	Student st = new Student();
    	Laptop laptop = new Laptop(); 
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter Student Details...");
    	System.out.println("Enter student roll no...");
    	int rollno = Integer.parseInt(br.readLine());
    	st.setRollno(rollno);
    	System.out.println("Enter Student name.....");
    	String name= br.readLine();
    	st.setName(name);
    	System.out.println("Enter Student Phone...");
    	int phone = Integer.parseInt(br.readLine());
    	st.setPhone(phone);
    	System.out.println("Enter Student add...");
    	String addr = br.readLine();
    	st.setAddr(addr);
    	
    	st.getLaptop().add(laptop);
    	laptop.getStudent().add(st);
    	
    //mapping With laptop
    	
    	
    	System.out.println("Enter Laptop Details...");
    	System.out.println("Enter laptop id...");
    	int lid =Integer.parseInt(br.readLine());
    	laptop.setLid(lid);
    	System.out.println("Enter laptop name....");
    	String lname=br.readLine();
    	laptop.setName(lname);
    	System.out.println("Enter laptop manufactur date....");
    	String dateofman=br.readLine();
    	laptop.setDateofman(dateofman);
    	
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf = con.buildSessionFactory(sr);
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	session.save(laptop);
    	session.save(st);
//    	System.out.println("Enter id What you get details......");
//    	int id =Integer.parseInt(br.readLine());
//    	st= (Student)session.get(Student.class, id);
    	tx.commit();
//    	System.out.println(st);
//    	System.out.println(laptop);
    }
}
