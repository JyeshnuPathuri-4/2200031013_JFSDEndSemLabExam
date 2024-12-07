package com.klef.jfsd.Impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;

public class HQLview {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();

        Query q = s.createQuery("select sid,sname from Student");

        List l = q.list();

        Iterator i = l.iterator();

        while(i.hasNext()){
            Object ob[] = (Object[]) i.next();
            System.out.println(ob[0]+" "+ob[1]);
        }
    }
}
