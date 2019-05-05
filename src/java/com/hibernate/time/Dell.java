package com.hibernate.time;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Dell {

    public static void delrow(int bnn) {
           Configuration cfg = new Configuration();
        cfg.configure("hibernate1.cfg.xml"); 

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Object o=session.load(Tm.class,new Integer(bnn));
        Tm p=(Tm)o;

        Transaction tx = session.beginTransaction();
        session.delete(p);
        System.out.println("Object Deleted successfully.....!!");
        tx.commit();
        session.close();
        factory.close();
    }
}

