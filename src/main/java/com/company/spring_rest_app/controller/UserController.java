package com.company.spring_rest_app.controller;

import com.company.spring_rest_app.model.User;
import com.company.spring_rest_app.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
@RequestMapping("users")
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);

    private static int counter;

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping
    public String handleRequest(Model model) {
        model.addAttribute("msg", "user request received");
        logger.info(model.toString());
        return "user-page";
    }

    @RequestMapping("{userId}")
    public String handleRequestById(@PathVariable("userId") Long userId, Model model) {
        User user = userService.getUserById(userId);
        model.addAttribute("user", user);
        logger.info(model.toString());
        return "user-page";
    }

    @ModelAttribute("time")
    public LocalDateTime getRequestTime() {
        return LocalDateTime.now();
    }

    @ModelAttribute("visits")
    public int getRequestCount() {
        return ++counter;
    }

    @ModelAttribute("querier")
    public void populateQuerierInfo(@RequestParam(value = "querier", required = false) String querier, Model model) {
        model.addAttribute("querier", querier == null ? "guest" : querier);
    }
}
