package com.example.contestapp.repository;

import com.example.contestapp.model.Answer;
import com.example.contestapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface AnswerRepository extends JpaRepository<Answer, Long> {

    @Modifying
    @Query("SELECT a from Answer a where a.question_id=?1")
    ArrayList<Answer> findAllByQuestion_id(long id);



}
