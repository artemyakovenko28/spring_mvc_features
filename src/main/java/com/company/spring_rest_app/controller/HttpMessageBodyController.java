package com.company.spring_rest_app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
public class HttpMessageBodyController {

    @RequestMapping(value = "/message", consumes = MediaType.TEXT_PLAIN_VALUE,
            produces = MediaType.TEXT_HTML_VALUE,
            method = RequestMethod.GET) /*"text/html"*/
    @ResponseBody
    public String handleGetRequest(@RequestBody byte[] bytes, @RequestBody String str) {
        System.out.println("Request body in bytes: " + Arrays.toString(bytes));
        System.out.println("Request body in String" + str);
        return "<html><body><h1>Hi there</h1></body></html>";
    }

    @RequestMapping(value = "/message", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE) /*"application/x-www-form-urlencoded"*/
    @ResponseStatus(HttpStatus.OK)
    public void handleFormRequest(@RequestBody MultiValueMap<String, String> formParams) {
        System.out.println("Form params received: " + formParams);
    }
}
