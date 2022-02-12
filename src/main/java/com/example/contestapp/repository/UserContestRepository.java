package com.example.contestapp.repository;

import com.example.contestapp.model.User;
import com.example.contestapp.model.UserContest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.security.Signature;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserContestRepository extends JpaRepository<UserContest, Long> {

    @Query("select u from UserContest u where u.contest_id = ?1")
    List<UserContest> findByContest_id(long contest_id);




   /* @Query("select u from UserContest u where u.user_id = 1 and u.contest_id = ?2")
    UserContest findByUser_idAndContest_id(long user_id, long contest_id); */



}
