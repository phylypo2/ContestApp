package com.example.contestapp.controller;

import com.example.contestapp.model.Answer;
import com.example.contestapp.model.Contest;
import com.example.contestapp.model.Question;
import com.example.contestapp.model.UserContest;
import com.example.contestapp.repository.AnswerRepository;
import com.example.contestapp.repository.QuestionRepository;
import com.example.contestapp.repository.UserContestRepository;
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
import java.util.List;

@Controller
@RequestMapping("/answer")
@RequiredArgsConstructor
public class AnswerController {


    private final AnswerRepository answerRepository;
    private final UserContestRepository userContestRepository;
    private final QuestionRepository questionRepository;

    @GetMapping("/add/{questionId}")
    public String getQuestion(Model model ) {

        answerRepository.findAll();
        model.addAttribute("answer", new Answer());

        return "answer/add";
    }

    @PostMapping("/add/{questionId}")
    public String saveAnswer(@PathVariable long questionId, @Valid Answer answer, Question question, UserContest userContest, UserDetails userDetails,
                             BindingResult bindingResult)  {
        if (bindingResult.hasErrors()) {
            return "/";
        }


       // UserContest userContest1 = new UserContest();
       // long userContestId = userContest1.getContest_id();
        String country = answer.getCountry();
        String participant = answer.getParticipant();
        String song = answer.getSong();
        answer.setParticipant(participant);
        answer.setCountry(country);
        answer.setSong(song);
        answer.setQuestion_id(questionId);
       // answer.setUser_contest_id(userContestId);
        question.getAnswers().add(answer);
        answerRepository.save(answer);

        return "answer/added";
    }

    @GetMapping("/list")
    public String getQuestionList(Model model, Question question, Contest contest) {
        List<Answer> answerList = answerRepository.findAll();



        model.addAttribute("answer", answerList);
        model.addAttribute("question", questionRepository.findAll());
      //  model.addAttribute("answer", answerRepository.findAll());
        return "answer/list";

    }

    @GetMapping("/list/{id}")
    public String getAnswerListByQuestionID(@PathVariable long id, Model model,@Valid Answer answer) {


        model.addAttribute("question", questionRepository.findAllByContest_id(id));
        model.addAttribute("userContest", userContestRepository.findById(id));
        model.addAttribute("answer", answerRepository.findAllByQuestion_id(id));
        //   model.addAttribute("contestId", id);
        return "answer/list";

    }
}
