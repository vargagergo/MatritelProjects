package com.matritel.kedua.entity.repository;

import com.matritel.kedua.entity.Person;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

    private static SessionFactory sessionFactory;



    public HibernateUtil (){

    }

    public static void createSessionFactory() {
        if(sessionFactory != null){
            return;
        }
        Configuration configuration = new Configuration() ;
        configuration.addClass(Person.class);
        sessionFactory  = configuration.buildSessionFactory();
    }


    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            createSessionFactory();
        }
        return sessionFactory;
    }





}
