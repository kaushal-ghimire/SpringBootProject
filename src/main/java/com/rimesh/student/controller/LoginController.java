package com.rimesh.student.controller;

import com.rimesh.student.entities.User;
import com.rimesh.student.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


import javax.persistence.OneToOne;
import java.util.List;


@Controller
@Slf4j
public class LoginController {


    @Autowired
    private UserRepository repo;

    @GetMapping(" ")
    public String viewHomePage() {
        return "index";
    }


    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @GetMapping("/login/client")
    public String client() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return "client_login";
    }

    @GetMapping("/admin/services")
    public String list_users() {
        return "users";
    }

}