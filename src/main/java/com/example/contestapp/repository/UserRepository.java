package com.example.contestapp.repository;

import com.example.contestapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u from User u WHERE u.login = ?1")
    User findByLogin(String login);

    @Query("SELECT distinct u from User u where u.id = ?1" )
    User findUserById(long id);



    /* @Query("SELECT u from User WHERE u.id = ?1")
    User findById(long id); */



}
