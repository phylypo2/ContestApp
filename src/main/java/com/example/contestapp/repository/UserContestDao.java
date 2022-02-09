package com.example.contestapp.repository;

import com.example.contestapp.model.User;
import com.example.contestapp.model.UserContest;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserContestDao {

    @PersistenceContext
    EntityManager entityManager;


    public void save(UserContest userContest) {
        entityManager.persist(userContest);
    }

}
