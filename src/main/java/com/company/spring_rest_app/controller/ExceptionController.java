package com.company.spring_rest_app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Arrays;

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

    @RequestMapping("/exception/class-cast")
    public void throwClassCastException() {
        throw new ClassCastException();
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler(ClassCastException.class)
    @ResponseBody
    public String handleException(ClassCastException ex) {
        return "Exception: " + ex + "\nStack trace: " + Arrays.toString(ex.getStackTrace());
    }
}
