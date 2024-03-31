package com.proyecto.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(path = { "/home", "/" })
    public String index() {
        return "home";
    }

}
