package com.matritel.kedua.entity.repository;
import com.matritel.kedua.entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class PersonRepositoryImplementation implements PersonRepository{


    private Session session;

    public PersonRepositoryImplementation() {

        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public Person getbyID(int id) {
        return session.get(Person.class, id);

    }

    @Override
    public void save(Person person) {

        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();

    }

    @Override
    public void update(Person persi2) {


        session.beginTransaction();
        session.update(persi2);
        session.getTransaction().commit();
        //use setter in the main

        //        try {
//            session.beginTransaction();
//            persi1.setFirstname(persi2.getFirstname());
//            persi1.setLastname(persi2.getLastname());
//            persi1.setBirthday(persi2.getBirthday());
//            persi1.setNickname(persi2.getNickname());
//            session.getTransaction().commit();
//        } catch (Exception exp) {
//            session.getTransaction().rollback();
//        }


    }

    @Override
    public void delete(Person person) {
        session.beginTransaction();
        session.delete(person);
        session.getTransaction().commit();
    }



    @Override
    public List<Person> getAllPersonsWithHQL() {
        List<Person> list =  session.createQuery("from Person").list();
        return list;

    }

    @Override
    public List<Person> getAllPersons() {
        CriteriaQuery<Person> criteriaQuery = session.getCriteriaBuilder().createQuery(Person.class);
        criteriaQuery.from(Person.class);
        List<Person> list = session.createQuery(criteriaQuery).getResultList();
        return list;
    }

    @Override
    public List<Person> getAllPersonsDeprecated() {
        List<Person> personList = session.createCriteria(Person.class).list();
        return personList;
    }


    public void closeSession(){
        session.close();
    }
}
