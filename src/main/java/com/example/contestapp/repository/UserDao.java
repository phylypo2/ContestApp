package com.example.contestapp.repository;

import com.example.contestapp.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDao {

    @PersistenceContext
    EntityManager entityManager;


    public void save(User user) {
        entityManager.persist(user);
    }
    public void update(User user) {
        entityManager.merge(user);
    }
    public User findById(long id) {
        return entityManager.find(User.class, id);
    }


}
