package com.BMICalculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class BMIController {
    private int height;
    private double weight;
    private double bmi = weight / height / height;


    @GetMapping("calculate")
    public String calculate(Model model) {
        model.addAttribute("height", height);
        model.addAttribute("weight", weight);
        return "input-template";
    }

    @PostMapping("result")
    public String result(Model model,BMI bmi) {
        model.addAttribute("bmi", bmi.getResult());
        return "output-template";
    }
}
