package ru.alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Neil Alishev
 */
@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false ) String surname,
    Model model) {

        //System.out.println("hello" + name + surname);
        model.addAttribute("message", "hello  " + name + surname);

        return "first/hello";
    }
    @GetMapping("/calc")
    public String calc(@RequestParam(value = "name", required = false) int name,
                           @RequestParam(value = "surname", required = false ) int surname,
                           @RequestParam(value = "operation", required = false) String operation,
                           Model model) {

        String plus = "plus";
        if (plus.equals(operation)) {
            int sum = name + surname;
            model.addAttribute("message", sum);
        }
        //model.addAttribute("message", "hello  " + name + surname);

        return "first/calc";
    }


    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}
