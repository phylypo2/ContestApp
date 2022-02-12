package com.example.contestapp.repository;

import com.example.contestapp.model.Contest;
import com.example.contestapp.model.User;
import com.example.contestapp.model.UserContest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContestRepository extends JpaRepository<Contest, Long> {

    @Modifying
    @Query("delete from UserContest s where s.contest_id = ?1 and s. user_id = ?2")
    UserContest deleteContestById();

    @Query("SELECT u from Contest u WHERE u.name = ?1")
    Contest findByName(String name);


    @Query("select c from Contest c where c.id = ?1")
    Optional<Contest> findByContestId(Long aLong);

    @Query("select c from Contest c where c.name = ?1 and c.id = ?2")
    Contest findByNameAndId();

  /*  @Query("SELECT DISTINCT q FROM Question q LEFT JOIN FETCH q.contest_id WHERE :contest_id MEMBER OF q.contest_id")
    List<Contest> findByQuestions(); */



}
