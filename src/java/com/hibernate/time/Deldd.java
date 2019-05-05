
package com.hibernate.time;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Deldd {
     public static void delroww(int p) {
           Configuration cfg = new Configuration();
        cfg.configure("hibernate2.cfg.xml"); 

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Object o=session.load(Dr.class,new Integer(p));
        Dr pp=(Dr)o;

        Transaction tx = session.beginTransaction();
        session.delete(pp);
        System.out.println("Object Deleted successfully.....!!");
        tx.commit();
        session.close();
        factory.close();
    }
}
