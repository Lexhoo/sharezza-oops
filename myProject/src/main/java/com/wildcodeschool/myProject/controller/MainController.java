package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/movie")
    @ResponseBody
    public String showTitle(@RequestParam String title, @RequestParamm(defaultValue = "", required = false) String year) {
        if (!year.isEmpty()) {
            return "The movie's title is " + title + " (" + year + ")";
        }
        return "The movie's title is " + title;
    }





}