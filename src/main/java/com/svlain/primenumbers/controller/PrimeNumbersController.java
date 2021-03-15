package com.svlain.primenumbers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrimeNumbersController {

    @RequestMapping("/")
    @ResponseBody
    public String PrimeNumbers() {
        return "Hello World";
    }
}