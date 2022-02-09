package com.example.contestapp.repository;

import com.example.contestapp.model.Contest;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ContestDao {

    @PersistenceContext
    EntityManager entityManager;

    public void save(Contest contest) {
        entityManager.persist(contest);
    }

    public List<Contest> findAll() {
        var query = entityManager.createQuery("SELECT c from Contest c");
        return query.getResultList();
    }

}
