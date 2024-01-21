package ru.alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Neil Alishev
 */
@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {

        //System.out.println("Hello, " + name + " " + surname);
        model.addAttribute("key", "Hello,  " + name + "  " + surname);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }

    @GetMapping("/another")
    public String an() {return "first/another";}

    @GetMapping("/calc")
    public String calc(@RequestParam(value = "name", required = false) int name,
                            @RequestParam(value = "surname", required = false) int surname,
                       @RequestParam(value = "operation", required = false) String operation,
                            Model model) {

        //System.out.println("Hello, " + name + " " + surname);
        double result;
        if ("multiplication".equals(operation)) {
            result = name + surname;
        } else result = 0;
        model.addAttribute("key", result);

        return "first/calc";
    }
}