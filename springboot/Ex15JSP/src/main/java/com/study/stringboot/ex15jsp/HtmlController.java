package com.study.stringboot.ex15jsp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    @GetMapping("/")
    public String home(){
        return "ex01"; // ex01.jsp을 html 응답한다.
    }
}