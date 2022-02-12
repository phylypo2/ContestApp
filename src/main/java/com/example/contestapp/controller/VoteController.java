package com.example.contestapp.controller;

import com.example.contestapp.model.Answer;
import com.example.contestapp.model.Question;
import com.example.contestapp.model.UserContest;
import com.example.contestapp.model.Vote;
import com.example.contestapp.repository.AnswerRepository;
import com.example.contestapp.repository.VoteRepository;
import com.example.contestapp.service.UserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequiredArgsConstructor

public class VoteController {
    @Autowired
    private final VoteRepository voteRepository;
    private final AnswerRepository answerRepository;


    @GetMapping("/answer/vote/{answerId}")
    public String getVoteForm(Model model, @Valid Vote vote) {
        model.addAttribute("vote", new Vote());
        return "answer/vote";
    }


    @PostMapping("/answer/vote/{answerId}")
    public String saveVote(@PathVariable long answerId, @Valid Vote vote, Answer answer,
                           BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "answer/vote";
        }
       // long questionId = answer.getQuestion_id();
      //  answer.setQuestion_id(questionId);
       // answerRepository.save(answer);
        // UserContest userContest1 = new UserContest();
        // long userContestId = userContest1.getContest_id();
        int points = vote.getPoints();
        vote.setPoints(points);
        vote.setAnswer_id(answerId);
        String getParticipant = answer.getParticipant();
        answer.setParticipant(getParticipant);

        // answer.setUser_contest_id(userContestId);
        // question.getAnswers().add(answer);
        voteRepository.findAllByAnswer_id(answerId);
        voteRepository.save(vote);




        return "answer/voted";
    }

    @GetMapping("answer/voted")
    public String sumPoints(@Valid Vote vote, Model model) {
        // vote.getPoints();
        int points = vote.getPoints();
        model.addAttribute("points", voteRepository.sumAllPoints(points));
   return "answer/points";
    }

    @GetMapping("answer/points/{points}")
    public String sumPoints2(@PathVariable int points, Model model) {
       // int points = vote.getPoints();
         model.addAttribute("points", voteRepository.sumAllPoints(points));
        return "answer/points";
    }

}


