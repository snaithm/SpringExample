package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.model.Greeting;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HomeController extends AbstractController{

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
        Greeting greeting = new Greeting();
        greeting.setMessage("Hello");
        greeting.setName("Matthew");

        return new ModelAndView("index", "x", greeting);
    }
}