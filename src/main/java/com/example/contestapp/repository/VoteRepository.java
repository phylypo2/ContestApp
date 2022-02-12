package com.example.contestapp.repository;

import com.example.contestapp.model.Answer;
import com.example.contestapp.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface VoteRepository extends JpaRepository<Vote, Long> {

    @Modifying
    @Query("SELECT v from Vote v where v.answer_id=?1")
    ArrayList<Vote> findAllByAnswer_id(long id);

    @Query("SELECT sum(e.points) from Vote e group by e.answer_id")
    List<Integer> sumAllPoints(int points);
}
