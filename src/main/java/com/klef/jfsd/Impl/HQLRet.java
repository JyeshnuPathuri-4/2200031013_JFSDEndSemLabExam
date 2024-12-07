package com.klef.jfsd.Impl;

import com.klef.jfsd.models.Department;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class HQLRet {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Query q = s.createQuery("from Student");
        List<Department> l = q.list();
        for(Department x:l){
            System.out.println("Name: "+x.getSname());
            System.out.println("Fee: "+x.getSlocation());
            System.out.println("Id: "+x.getSid());
        }
    }
}