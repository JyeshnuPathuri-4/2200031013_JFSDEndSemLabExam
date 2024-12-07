package com.klef.jfsd.Impl;

import com.klef.jfsd.models.Department;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;

public class HQLRetIter {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();

        Transaction t = s.beginTransaction();

        Query q = s.createQuery("from Student");

        List<Department> l = q.list();

        Iterator i = l.iterator();
        System.out.println("--------------Student Records---------------");
        while(i.hasNext()){
            Department std = (Department) i.next();
            System.out.println(std);
            System.out.println("\n");
        }
    }
}
