package com.klef.jfsd.Impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLUpdate {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();

        Transaction t = s.beginTransaction();

        Query q = s.createQuery("update Student set tname=:n where tid=:i");
        q.setParameter("n","Teja Sai");
        q.setParameter("i",105);
        q.executeUpdate();

        System.out.println("Record Updated Successfully");

        t.commit();
        s.close();
        sf.close();
    }
}
