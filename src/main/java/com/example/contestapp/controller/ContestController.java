package com.example.contestapp.controller;

import com.example.contestapp.model.Contest;
import com.example.contestapp.model.Question;
import com.example.contestapp.model.User;
import com.example.contestapp.model.UserContest;
import com.example.contestapp.repository.*;
import com.example.contestapp.service.UserDetails;
import com.example.contestapp.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/contest")
@RequiredArgsConstructor
public class ContestController {

    @Autowired
    private final ContestRepository contestRepository;
    private final UserRepository userRepository;
    private final UserContestRepository userContestRepository;
    private final QuestionRepository questionRepository;
    private final UserDao userDao;
    private final UserContestDao userContestDao;
    private final UserServiceImpl userService;
    private final ContestDao contestDao;


    @GetMapping("/create")
    public String getContest(Model model, User user) {


        model.addAttribute("create", new Contest());

        return "contest/create";
    }

    @GetMapping("/contest")
    public String getCreateContest(Model model, User user) {


        model.addAttribute("create", new Contest());

        return "contest/contest";
    }

    @PostMapping ("/create")//Utworzenie konkursu i przypisanie id usera i id contestu (user_contest)
    public String saveContest(@AuthenticationPrincipal UserDetails userDetails, Contest contest, UserContest userContest, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "/";
        }
        contestRepository.save(contest);

        UserContest userContest1 = new UserContest();
        long contestId = contest.getId();
        userContest1.setUser_id(userDetails.findId());
        userContest1.setContest_id(contestId);
        userContestRepository.save(userContest1);

        //contestDao.save(contest);
        return "redirect:list";
    }




    @GetMapping("/list")
    public String getList( Model model, Contest contest) {
        long contestId = contest.getId();
        model.addAttribute("userContest", userContestRepository.findAll());
        model.addAttribute("contest", contestRepository.findAll());
        model.addAttribute("question", questionRepository.findAll());
        return "contest/list";
    }
  /*  @GetMapping("/yourContest")
    public String getUserContests(Model model, UserDetails user) {
        model.addAttribute("userContest", userContestRepository.findAll());
        model.addAttribute("user", userRepository.findById(user.findId()));
        UserContest userContest = new UserContest();
        userContest.setUser_id(user.findId());
        userContestRepository.findById(user.findId());
        return "userContest/list";
    } */


    @GetMapping("/remove/{userContestId}/{contestId}")
    public String getRemoveForm(@PathVariable long userContestId, @PathVariable long contestId, Model model) {
        model.addAttribute("userContestId", userContestId);
        model.addAttribute("contestId", contestId );
        return "contest/delete";
    }

    @GetMapping("/delete/{userContestId}/{contestId}")

    public String removeContest(@PathVariable long userContestId,@PathVariable long contestId,  Model model) throws SQLIntegrityConstraintViolationException {



       userContestRepository.deleteById(userContestId);
       contestRepository.deleteById(contestId);


        model.addAttribute("userContestId", null);
        model.addAttribute("contestId", null);
        return "redirect:/contest/list";
        }


  //  @RequestMapping(value = "/contest/list/{id}", method = RequestMethod.GET)
    @GetMapping("listTest/{id}")
    public String userContestList (@PathVariable long id, Model model, Contest contest, UserContest userContest, Question question) {
        //   Iterable<Long> contests = Collections.singleton(id);
        List<Contest> contests = contestRepository.findAll();
        long contestId = contest.getId();
        Optional<Contest> optional = contestRepository.findById(id);
        List<Question> question1 = questionRepository.findAllByContest_id(id);



        model.addAttribute("contest", optional);
        model.addAttribute("question", question1);
        //   model.addAttribute("contest", contestRepository.findById(id));

        return "403";

    }



 /*   @GetMapping("/list")
    @ResponseBody
    public String findAll() {
        List<Contest> list = contestDao.findAll();
        return "findAll"; */


}
