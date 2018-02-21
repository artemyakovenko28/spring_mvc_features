package com.company.spring_rest_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectAttributesController {

    @RequestMapping("/redirect/{id}")
    public String handleTestRequest(@PathVariable String id, RedirectAttributes ra, Model model) {
        if (!id.matches("\\d+")) {
            model.addAttribute("msg", "id must contains only digits");
            return "error-page";
        }
        ra.addAttribute("attr", "attrVal");
        ra.addFlashAttribute("flashAttr", "flashAttrVal");
        return "redirect:/redirect2/{id}";
    }

    @RequestMapping("/redirect2/{id}")
    public String handleRequest(@PathVariable("id") String id,
                               @RequestParam("attr") String attr,
                               @ModelAttribute("flashAttr") String flashAttr,
                               Model model) {
        model.addAttribute("id", id);
        model.addAttribute("attr", attr);
        model.addAttribute("flashAttr", flashAttr);
        return "redirect-example-page";
    }
}
