package hibernatetest.main;

import hibernatetest.HibernateUtil;
import hibernatetest.Person;

import javax.persistence.EntityManager;

public class PersonFinder {
    public static void main(String[] args) {
        Person person = new Person();
        EntityManager entityManager = HibernateUtil.getEntityManager();// getting entity
        entityManager.getTransaction().begin();// start transaction
        Person personFromDB = entityManager.find(Person.class, 1l);
        entityManager.getTransaction().commit();
        HibernateUtil.close();





    }
}
