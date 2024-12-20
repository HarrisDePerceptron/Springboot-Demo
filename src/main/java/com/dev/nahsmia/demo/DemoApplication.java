package com.dev.nahsmia.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@SpringBootApplication
@Controller
public class DemoApplication {
    public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
    }
    // @GetMapping("/hello")
    // public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    //   return String.format("Hello %s!", name);
    // }

    // @GetMapping("/nashmia")
    // public String nashmia(@RequestParam(value = "name", defaultValue = "nashmia") String name) {
    //     return String.format("<h1>Hello %s!</h1>", name);
    // }

	@RequestMapping("/")
    public String home(@RequestParam(value = "name", defaultValue = "Nashmia") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
}
