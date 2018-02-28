package com.company.spring_rest_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class LocaleController {

    @RequestMapping("/locale")
    public String handleRequest(Locale locale, Model model) {
        String localeMsg = String.format("Request received. Language: %s, Country: %s %n",
                locale.getLanguage(), locale.getDisplayCountry());
        model.addAttribute("localeMsg", localeMsg);
        return "locale-page";
    }
}
