package study.datajpa.controller;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import study.datajpa.entity.Member;
import study.datajpa.repository.MemberRepository;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberRepository memberRepository;

    @GetMapping("/members/{id}")
    public String findMember( @PathVariable Long id) {
        return memberRepository.findById(id)
                .map(Member::getUsername)
                .orElse("Member not found");
    }

    /**
     * @author hyeongjun
     * @param member
     * @return
     */
    @GetMapping("/members2/{id}")
    public String findMember2( @PathVariable("id") Member member) {
        return member.getUsername();
    }


    @PostConstruct
    public void init() {
        Member member = new Member("memberA");
        memberRepository.save(member);
    }
}
