package com.example.contestapp.controller;

import com.example.contestapp.model.Contest;
import com.example.contestapp.model.Question;
import com.example.contestapp.model.UserContest;
import com.example.contestapp.repository.ContestRepository;
import com.example.contestapp.repository.QuestionDao;
import com.example.contestapp.repository.QuestionRepository;
import com.example.contestapp.repository.UserContestRepository;
import com.example.contestapp.service.UserDetails;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/question")
@RequiredArgsConstructor
@ToString
public class QuestionController {

    private final QuestionRepository questionRepository;
    private final ContestRepository contestRepository;
    private final UserContestRepository userContestRepository;
  //  private final QuestionDao questionDao;

    @GetMapping("/add/{id}")
    public String getQuestion(Model model ) {

        model.addAttribute("question", new Question());

        return "question/add";
    }

    @PostMapping("/add/{id}")
    public String saveQuestion(@PathVariable long id, @Valid Question question, Contest contest, UserContest userContest, BindingResult bindingResult)  {
        if (bindingResult.hasErrors()) {
            return "/";
        }

       String questName = question.getQuestName();
        question.setQuestName(questName);
        question.setContest_id(id);
        contest.getQuestions().add(question);
       questionRepository.save(question);

        return "question/list";
    }


    @GetMapping("/list")
    public String getQuestionList(Model model, Question question, Contest contest) {
        List<Question> questionList = questionRepository.findAll();



        model.addAttribute("questionList", questionList);
        model.addAttribute("contest", contestRepository.findAll());
        return "question/list";

    }

    @GetMapping("/list/{id}")
    public String getQuestionListId( Model model,UserDetails userDetails, Question question, Contest contest, UserContest userContest) {
        List<Question> questionList = questionRepository.findAll();
        List<Contest> id = contestRepository.findAll();
      //  long contestId = contest.getId();
        model.addAttribute("questionListId", questionList);
        model.addAttribute("contestId", id);
        return "question/specificList";

    }
}
