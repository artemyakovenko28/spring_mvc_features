package com.company.spring_rest_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {

    @RequestMapping("/exception")
    public String chooseException() {
        return "error/choose-exception-page";
    }

    @RequestMapping("/exception/npe")
    public void throwNpeException() {
        throw new NullPointerException("Test NullPointerException");
    }

    @RequestMapping("/exception/arithmetic")
    public void throwArithmeticException() {
        throw new ArithmeticException("Test ArithmeticException");
    }
}
