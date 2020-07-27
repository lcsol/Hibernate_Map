package com.hibernate.com.list;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
        cfg.configure("Emp-Config.xml");
        System.out.println("Configuration Object Created Successfully");
        SessionFactory sf = cfg.buildSessionFactory();
        System.out.println("Session Factory Object Created Successfully");
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        Emp e = new Emp();
        e.setId("100");
        e.setName("Lu Yang");
        Map<Integer, Address> map = new HashMap<>();
        Address a1 = new Address();
        a1.setAid("001");
        a1.setStreet("123 York Ave");
        a1.setState("New York");
        Address a2 = new Address();
        a2.setAid("002");
        a2.setStreet("432 x street");
        a2.setState("Georgia");
        map.put(1, a1);
        map.put(2, a2);
        e.setAddress(map);
        s.persist(e);
        t.commit();
        System.out.println("Successfully inserted into the Database");
        s.close();
        sf.close();
    }
}
