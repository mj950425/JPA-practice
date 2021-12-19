package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Member member = new Member();
        member.setId(1L);
        member.setName("Hello");
        entityManager.persist(member);
        entityManager.close();
        entityManagerFactory.close();
    }
}
