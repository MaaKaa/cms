package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class NewRandomController {

    @GetMapping(path = "/randomNumber/{max}", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String showRandom(@PathVariable(name = "max") int max){

        final Random random = new Random();
        final int number = random.nextInt(max) + 1;
        return "Wylosowano liczbę: " + number;
    }
}