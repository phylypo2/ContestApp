package com.example.contestapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long contest_id;


  //  @NotNull(message = "nie może byc nullem")
   // @NotBlank
    private String questName;

    @OneToMany
    @JoinColumn(name = "question_id")
    private List<Answer> answers;

   /* @JsonIgnore
    @ManyToOne(optional = false)
    @JoinColumn(name = "contest_id")
    private Contest contest; */





}
