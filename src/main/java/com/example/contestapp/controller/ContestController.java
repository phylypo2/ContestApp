package com.example.contestapp.controller;

import com.example.contestapp.model.Contest;
import com.example.contestapp.model.Question;
import com.example.contestapp.model.User;
import com.example.contestapp.model.UserContest;
import com.example.contestapp.repository.*;
import com.example.contestapp.service.UserDetails;
import com.example.contestapp.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Collections;

@Controller
@RequestMapping("/contest")
@RequiredArgsConstructor
public class ContestController {

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
    public String getList(Model model, User user) {
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


    @GetMapping("/remove/{id}")
    public String getRemoveForm(@PathVariable long id, Model model) {
        model.addAttribute("userContestId", id);
        return "contest/delete";
    }

    @GetMapping("/delete/{id}")

    public String removeContest(@PathVariable long id, Model model) throws SQLIntegrityConstraintViolationException {

       userContestRepository.deleteById(id);
       contestRepository.deleteById(id);


        model.addAttribute("userContestId", null);
        return "redirect:/contest/list";
        }





 /*   @GetMapping("/list")
    @ResponseBody
    public String findAll() {
        List<Contest> list = contestDao.findAll();
        return "findAll"; */


}
