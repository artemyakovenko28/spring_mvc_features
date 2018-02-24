package com.company.spring_rest_app.controller;

import com.company.spring_rest_app.annotation.ErrorView;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
@RequestMapping("/exception")
public class ExceptionController {

    @RequestMapping
    public String chooseException() {
        return "error/choose-exception-page";
    }

    // handled by SimpleMappingExceptionResolver
    @RequestMapping("/npe")
    public void throwNpeException() {
        throw new NullPointerException("Test NullPointerException");
    }

    //handled by SimpleMappingExceptionResolver and send to default error page,
    //because no mapping for ArithmeticException
    @RequestMapping("/arithmetic")
    public void throwArithmeticException() {
        throw new ArithmeticException("Test ArithmeticException");
    }

    // handled by ExceptionHandlerExceptionResolver because of @ExceptionHandler
    @RequestMapping("/class-cast")
    public void throwClassCastException() {
        throw new ClassCastException("Test ClassCastException");
    }

    // handled by custom HandlerExceptionToViewResolver because of @ErrorView
    @ErrorView(value = "error/errorview-exception-page", status = HttpStatus.GONE)
    @RequestMapping("/illegal-state")
    public void throwIllegalStateException() {
        throw new IllegalStateException("Test IllegalStateException");
    }

    //handled by custom resolver even though NumberFormatException
    //is mapped in SimpleMappingExceptionResolver. Reasons is: in iteration order
    //custom resolver is first to process
    @ErrorView(value = "error/errorview-exception-page")
    @RequestMapping("/number-format")
    public void throwNumberFormatException() {
        throw new NumberFormatException("Test NumberFormatException");
    }

    @ExceptionHandler(ClassCastException.class)
    @ResponseBody
    public String handleClassCastException(ClassCastException ex) {
        return "Exception handled by custom HandlerExceptionToViewResolver: " +
                ex + "\nStack trace: " + Arrays.toString(ex.getStackTrace());
    }
}
