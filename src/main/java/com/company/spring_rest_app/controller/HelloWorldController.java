package com.company.spring_rest_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printHello(Model model) {
        model.addAttribute("msg", "Hello from first controller!");
        return "hello";
    }

    @RequestMapping(value = "/redirect-view-controller-response")
    public String requestFromRedirectViewController(@RequestParam(required = false) Map<String, String> params,
                                                    HttpServletRequest request,
                                                    Model model) {
        model.addAttribute("requestURI", request.getRequestURI());
        model.addAttribute("requestParams", params);
        return "redirect-view-controller-page";
    }
}
