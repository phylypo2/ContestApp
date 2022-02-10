package com.example.contestapp.repository;

import com.example.contestapp.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {

}
