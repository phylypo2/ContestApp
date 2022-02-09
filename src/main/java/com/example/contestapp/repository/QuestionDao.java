package com.example.contestapp.repository;

import com.example.contestapp.model.Contest;
import com.example.contestapp.model.Question;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class QuestionDao {

    @PersistenceContext
    EntityManager entityManager;

    public void save(Question question) {
        entityManager.persist(question);
    }

    public List<Question> findAll() {
        var query = entityManager.createQuery("SELECT c from Question c");
        return query.getResultList();
    }
}
