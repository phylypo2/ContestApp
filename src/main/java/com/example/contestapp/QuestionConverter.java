package com.example.contestapp;

import com.example.contestapp.model.Question;
import com.example.contestapp.repository.QuestionRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;


public class QuestionConverter implements Converter<String, Question> {

    @Autowired
    QuestionRepository questionRepository;
    @Override
    public Question convert(String source) {

        return (Question) questionRepository.findAllByContest_id(Long.parseLong(source));
    }







}
