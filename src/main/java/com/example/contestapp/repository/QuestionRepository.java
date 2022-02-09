package com.example.contestapp.repository;

import com.example.contestapp.model.Contest;
import com.example.contestapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.QueryCreationException;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {


  //  List<Question> findByContest_id(long contestId);



}
