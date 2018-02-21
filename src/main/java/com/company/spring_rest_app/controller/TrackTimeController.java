package com.company.spring_rest_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpSession;
import java.time.Duration;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/time")
public class TrackTimeController {

    @RequestMapping
    public String trackTime(@SessionAttribute("sessionStartTime") LocalDateTime startDateTime, Model model) {
        Duration duration = Duration.between(startDateTime, LocalDateTime.now());
        model.addAttribute("sessionTimeDuration", duration.getSeconds());
        return "time-page";
    }

    @RequestMapping("/clear")
    public String clearTime(HttpSession session) {
        session.invalidate();
        return "redirect:/time";
    }

//    @RequestMapping("/clear")
//    public RedirectView clearTime(HttpSession session) {
//        session.invalidate();
//        RedirectView rv = new RedirectView();
//        rv.setUrl("/time");
//        return rv;
//    }

}
