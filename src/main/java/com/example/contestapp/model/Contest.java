package com.example.contestapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contest")
public class Contest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    private String name;



    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name= "contest_id")
    private List<UserContest> userContest;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn (name = "contest_id")
    private List<Question> questions = new ArrayList<>();
}
