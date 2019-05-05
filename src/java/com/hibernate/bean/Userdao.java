
package com.hibernate.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Userdao {
           public boolean check(User original){
        User db=null;
        Configuration cf=new Configuration();
        cf.configure();
        SessionFactory sf=cf.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        System.out.println(original.getUrn());
        db=(User)session.get(User.class , original.getUrn());
        session.save(original);
        tx.commit();
        session.close();
        sf.close();
       if(db==null){
          return false;
       }
       else{
        return original.equals(db);
       }
           }
}
