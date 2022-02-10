package com.example.contestapp.repository;

import com.example.contestapp.model.Contest;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import java.awt.print.Book;
import java.util.List;

@Repository
@Transactional
public class ContestDao {

    @PersistenceContext
    EntityManager entityManager;

    public void save(Contest contest) {
        entityManager.persist(contest);
    }

    @NotNull
    public Contest findById(long id) {
        return entityManager.find(Contest.class, id);
    }

    public List<Contest> findAll() {
        var query = entityManager.createQuery("SELECT c from Contest c");
        return query.getResultList();
    }

}
