package com.mysite.sbb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String index() {
        return "Hello World";
    }
    @GetMapping("/sbb")
    @ResponseBody
    public String sbb() {
        return "index";
    }
}
