package com.hibernate.time;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Userdaoo {
public boolean checkk(Tm originall){
        Tm dbb=null;
        Configuration cf=new Configuration();
        cf.configure("hibernate1.cfg.xml");
        SessionFactory sff=cf.buildSessionFactory();
        Session sessionn=sff.openSession();
        Transaction tx=sessionn.beginTransaction();
        System.out.println(originall.getBn());
        sessionn.save(originall);
        tx.commit();
        sessionn.close();
        sff.close();
       if(dbb==null){
          return false;
       }
       else{
        return originall.equalss(dbb);
       }    
}    
}
