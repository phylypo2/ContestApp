package com.example.contestapp.repository;

import com.example.contestapp.model.Contest;
import com.example.contestapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.QueryCreationException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>  {



    @Query( value ="SELECT q from Question q where q.contest_id =?1")
    List<Question> findAllByContest_id(long id);

   // @Query("SELECT c from Question c where c.contest_id =?1")
   // List<Question> findByContest_id(Long id);

   // List<Question> findByContest(Contest contest);



}
