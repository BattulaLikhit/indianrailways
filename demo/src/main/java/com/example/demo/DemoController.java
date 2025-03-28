package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/railway")
public class DemoController {
       @GetMapping
       public String get() {
    	   return "Hello Anuu happy birthday!";
       }
       @GetMapping("/welcome")
       public String getWelcome() {
    	   return "Welcome bro!";
       }
}
