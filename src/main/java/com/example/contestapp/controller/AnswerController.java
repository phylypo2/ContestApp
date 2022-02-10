package com.example.contestapp.controller;

import com.example.contestapp.model.Answer;
import com.example.contestapp.model.Contest;
import com.example.contestapp.model.Question;
import com.example.contestapp.model.UserContest;
import com.example.contestapp.repository.AnswerRepository;
import com.example.contestapp.service.UserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/answer")
@RequiredArgsConstructor
public class AnswerController {

    private final AnswerRepository answerRepository;

    @GetMapping("/add/{questionId}/{userContestId}")
    public String getQuestion(Model model ) {

        model.addAttribute("answer", new Answer());

        return "answer/add";
    }

    @PostMapping("/add/{questionId}/{userContestId}")
    public String saveAnswer(@PathVariable long questionId, @PathVariable long userContestId , @Valid Answer answer, Question question, UserContest userContest, UserDetails userDetails, BindingResult bindingResult)  {
        if (bindingResult.hasErrors()) {
            return "/";
        }

        String country = answer.getCountry();
        String participant = answer.getParticipant();
        String song = answer.getSong();
        answer.setParticipant(participant);
        answer.setCountry(country);
        answer.setSong(song);
        answer.setQuestion_id(questionId);
        answer.setUser_contest_id(userContestId);
        question.getAnswers().add(answer);
        answerRepository.save(answer);

        return "question/specificList";
    }
}
