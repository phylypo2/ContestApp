package com.example.contestapp.controller;

import com.example.contestapp.model.Contest;
import com.example.contestapp.model.User;
import com.example.contestapp.model.UserContest;
import com.example.contestapp.repository.ContestRepository;
import com.example.contestapp.repository.UserContestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class UserContestController {


  @Autowired
  private UserContestRepository userContestRepository;

  @Autowired
  private ContestRepository contestRepository;

    @RequestMapping(value = "/userContest/list/{id}", method = RequestMethod.GET)
    public String userContestList (@PathVariable long id, Model model, Contest contest, UserContest userContest) {
     //   Iterable<Long> contests = Collections.singleton(id);
        List<UserContest> userContests = userContestRepository.findAll();
        long contestId = contest.getId();
        Optional<UserContest> optional = userContestRepository.findById(contestId);





        model.addAttribute("userContest", optional);
     //   model.addAttribute("contest", contestRepository.findById(id));

        return "userContest/list";

    }
}
