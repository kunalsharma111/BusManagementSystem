package com.hibernate.time;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Ddao {
public boolean checkk(Dr originall){
        Dr dbb=null;
        Configuration cf=new Configuration();
        cf.configure("hibernate2.cfg.xml");
        SessionFactory sff=cf.buildSessionFactory();
        Session sessionn=sff.openSession();
        Transaction tx=sessionn.beginTransaction();
        System.out.println(originall.getBu());
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
