package com.study.stringboot.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HtmlController {
    @Autowired
    private Calculator calculator;
    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("num1",0);
        model.addAttribute("num2",0);
        model.addAttribute("result", 0);
        return "calculator";
    }
    @PostMapping("/{op}")
    public String calculate(@PathVariable String op, CalculatorDto dto, Model model) {
        int num1 = dto.getNum1();
        int num2 = dto.getNum2();
        int result;
        switch (op) {
            case "plus" -> result = num1 + num2;
            case "minus" -> result = num1 - num2;
            case "multiply" -> result = num1 * num2;
            case "divide" -> result = num1 / num2;
            default -> {
                num1 = 0;
                num2 = 0;
                result = 0;
            }
        }
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("result", result);
        return "calculator";
    }
}
