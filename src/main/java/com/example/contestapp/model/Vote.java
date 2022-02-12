package com.example.contestapp.model;

import com.example.contestapp.validator.MaxPoints;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vote")

public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long answer_id;
    @Min(0)
    @Max(value = 12, message = "You can only give points between 0 and 12 to participant!")
    private int points;

    @OneToOne(optional = false)
    @JoinColumn(name = "answer_id", insertable = false, updatable = false)
    private Answer answer;
}
