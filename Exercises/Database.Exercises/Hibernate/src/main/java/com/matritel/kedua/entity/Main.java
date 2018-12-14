package com.matritel.kedua.entity;

import com.matritel.kedua.entity.repository.HibernateUtil;
import com.matritel.kedua.entity.repository.PersonRepositoryImplementation;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        PersonRepositoryImplementation pri = new PersonRepositoryImplementation();

//        Person persi = pri.getbyID(1);
//        System.out.println(persi);
//        Person Aladar = pri.getbyID(26);
//
//        List<Person> list = pri.getAllPersonsWithHQL();
//        System.out.println(list);
//        pri.delete(Aladar);

        List<Person> list1 = pri.getAllPersonsWithHQL();
        System.out.println(list1);

        pri.closeSession();
        HibernateUtil.getSessionFactory().close();
    }

}
