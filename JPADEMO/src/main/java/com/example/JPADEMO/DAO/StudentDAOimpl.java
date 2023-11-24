package com.example.JPADEMO.DAO;
import com.example.JPADEMO.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOimpl implements StudentDAO {
    private final EntityManager entityManager;
    @Autowired
    public StudentDAOimpl(EntityManager theEntityManager)
    {
        entityManager=theEntityManager;
    }
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }
}