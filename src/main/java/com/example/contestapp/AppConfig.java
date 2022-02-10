package com.example.contestapp;

import com.example.contestapp.repository.QuestionRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.LocaleContextResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.persistence.EntityManagerFactory;
import javax.validation.Validator;
import java.util.Locale;

@Configuration
@ComponentScan(basePackages = "com.example.contestapp")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.example.contestapp")
@EntityScan(basePackages = "com.example.contestapp.model")

public class AppConfig {

    @Bean(name = "localeResolver")
    public LocaleContextResolver getLocalContextResolver() {
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(new Locale("pl", "PL"));
        return localeResolver;
    }

    @Bean
    public Validator validator() {
        return new LocalValidatorFactoryBean();
    }



    @Bean(name = "transactionManager")
    public JpaTransactionManager jpaTransactionManager(EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }



}
