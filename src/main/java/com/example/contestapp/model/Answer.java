package com.example.contestapp.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long question_id;
  //  private long user_contest_id;


    private String country;
    private String participant;
    private String song;
  //  private int points;

}
