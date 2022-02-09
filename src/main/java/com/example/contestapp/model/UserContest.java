package com.example.contestapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_contest")
public class UserContest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private long id;
    @Column(name = "user_id", nullable = false)
    private long user_id;
    @Column(name = "contest_id", nullable = false)
    private long contest_id;




    @OneToMany
    @JoinColumn(name = "user_contest_id")
    private List<Answer> answers;


}
