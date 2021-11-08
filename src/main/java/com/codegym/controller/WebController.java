package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class WebController {

    @GetMapping("")

    public ModelAndView show () {
        ModelAndView modelAndView = new ModelAndView("/home");
        return modelAndView;
    }
}
