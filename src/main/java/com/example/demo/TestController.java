package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class TestController {
    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }
    @GetMapping("/test")
    public String test(Model model){
        return "test";
    }
}
