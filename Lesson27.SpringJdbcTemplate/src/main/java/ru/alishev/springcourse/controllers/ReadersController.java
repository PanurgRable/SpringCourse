package ru.alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.alishev.springcourse.dao.ReaderDAO;
import ru.alishev.springcourse.models.Book;
import ru.alishev.springcourse.models.Reader;

import javax.validation.Valid;

@Controller
@RequestMapping("readers")
public class ReadersController {

    private final ReaderDAO readerDAO;


    public ReadersController(ReaderDAO readerDAO) {
        this.readerDAO = readerDAO;
    }
    @GetMapping
    public String index(Model model) {
        model.addAttribute("readers", readerDAO.index());
        return "readers/index";
    }
    @GetMapping("/{id}")
    public String show (@PathVariable("id") int id, Model model) {
        model.addAttribute("reader", readerDAO.show(id));
        return "readers/show";
    }
    @GetMapping("/new")
    public String newReader (@ModelAttribute("reader") Reader reader) {
        return "readers/new";
    }
    @PostMapping()
    public String create(@ModelAttribute("reader") @Valid Reader reader,
                         BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "readers/new";

        readerDAO.save(reader);
        return "redirect:/readers";
    }
}
