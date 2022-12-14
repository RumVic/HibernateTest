package hibernatetest.main;

import hibernatetest.HibernateUtil;
import hibernatetest.Person;

import javax.persistence.EntityManager;

public class PersonLoader {
    public static void main(String[] args) throws Exception {
        Person person = new Person(1,12,"name","surname");
        EntityManager entityManager = HibernateUtil.getEntityManager();// getting entity
        entityManager.getTransaction().begin();// start transaction
        entityManager.persist(person);// save person
        entityManager.getTransaction().commit(); // commit transaction
        HibernateUtil.close();


    }
}
