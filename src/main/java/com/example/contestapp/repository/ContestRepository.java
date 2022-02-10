package com.example.contestapp.repository;

import com.example.contestapp.model.Contest;
import com.example.contestapp.model.User;
import com.example.contestapp.model.UserContest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContestRepository extends JpaRepository<Contest, Long> {

    @Modifying
    @Query("delete from UserContest s where s.contest_id = ?1 and s. user_id = ?2")
    UserContest deleteContestById();

    @Query("SELECT u from Contest u WHERE u.name = ?1")
    Contest findByName();





}
