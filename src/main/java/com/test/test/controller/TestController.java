package com.test.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/greetings")
    public String TestPage(Model model) {
        model.addAttribute("username", "가드니");
        return "greetings";
    }

    @GetMapping("/bye")
    public String ByePage(Model model) {
        model.addAttribute("nickname", "가드니");
        return "byes";
    }
}
