package hello.core.controller;

import hello.core.member.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "박형준 못생겼다");
        return "index";
    }
    @GetMapping("/member")
    public String member(Model model) {
        Member member = new Member();
        System.out.println(Member.class);
        model.addAttribute("message", "member");
        return "index";
    }

}
