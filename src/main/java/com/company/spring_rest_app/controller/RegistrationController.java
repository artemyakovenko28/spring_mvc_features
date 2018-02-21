package com.company.spring_rest_app.controller;

import com.company.spring_rest_app.model.User;
import com.company.spring_rest_app.service.UserService;
import com.company.spring_rest_app.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    private UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "user-registration";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String doRegistration(/*@Valid*/ @ModelAttribute("user") User user,
                                            BindingResult bindingResult,
                                            RedirectAttributes ra) {
        new UserValidator().validate(user, bindingResult);
        if (bindingResult.hasErrors()) {
            return "user-registration";
        }

        userService.saveUser(user);
        ra.addFlashAttribute("user", user);
        return "redirect:/registration-success";
    }

    @RequestMapping(value = "/registration-success", method = RequestMethod.GET)
    public String finishRegistration(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("user", user);
        return "registration-done";
    }

//    private void populateError(String field, Model model, BindingResult bindingResult) {
//        if (bindingResult.hasFieldErrors(field)) {
//            model.addAttribute(field + "Error",
//                    bindingResult.getFieldError(field).getDefaultMessage());
//        }
//    }
}
