package com.klef.jfsd.Impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLInsert {
    public static void main(String[] args)
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();

        Transaction t =s.beginTransaction();


        Query q=s.createSQLQuery("INSERT Student (tid,tname,tfee) values(105,'RADHA',18)");

        q.executeUpdate();



    }
}
