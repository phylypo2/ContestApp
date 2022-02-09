package com.example.contestapp.repository;

import com.example.contestapp.model.User;
import com.example.contestapp.model.UserContest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.security.Signature;
import java.util.List;

@Repository
public interface UserContestRepository extends JpaRepository<UserContest, Long> {


  //  List<UserContest> findByAnswers();


}
