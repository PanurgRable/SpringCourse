package ru.alishev.springcourse.FirstSecurityApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.alishev.springcourse.FirstSecurityApp.models.Person;

import javax.validation.Valid;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/login")
    public String loginPage() {
        return "auth/login";

    }

    @GetMapping("/registration")
    public String registrationPage (@ModelAttribute("person")Person person) {
        return "auth/registration";
    }

    @PostMapping("/registration")
    public String performRegistration (@ModelAttribute("person") @Valid Person person) {

    }
}