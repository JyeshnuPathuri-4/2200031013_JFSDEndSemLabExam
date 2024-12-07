package com.klef.jfsd.Impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class HQLDelete {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        Scanner sc = new Scanner(System.in);
        Query q = s.createQuery("delete from Student where tid=:id");
        System.out.println("Enter Id to delete: ");
        int n = sc.nextInt();
        q.setParameter("id",n);
        q.executeUpdate();
        System.out.println("Deleted Successfully");

        t.commit();
        s.close();
        sf.close();
    }
}
