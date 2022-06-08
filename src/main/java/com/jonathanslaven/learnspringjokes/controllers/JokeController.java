package com.jonathanslaven.learnspringjokes.controllers;

import com.jonathanslaven.learnspringjokes.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model) {
        String joke = jokeService.getJoke();
        model.addAttribute("joke", joke);
        System.out.println(joke);
        return "index";
    }
}
