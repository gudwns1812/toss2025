package com.jpabook.jpashop.repository;

import com.jpabook.jpashop.domain.Member;
import com.jpabook.jpashop.service.MemberService;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberServiceTest {
    @Autowired
    MemberService memberService;
    @Autowired MemberRepository memberRepository;
    @Autowired
    EntityManager em;
    @Test
    public void 회원가입() {
        // given
        Member member = new Member();
        member.setName("KIM");

        // when
        Long savedId = memberService.join(member);

        // then
//        em.flush();
        assertEquals(member, memberRepository.findOne(savedId));
    }
    @Test
    public void 중복_회원_가입() throws Exception {
        // given
        Member member1 = new Member();
        member1.setName("KIM");

        Member member2 = new Member();
        member2.setName("KIM");
        // when
        memberService.join(member1);

        // then
        assertThrows(IllegalStateException.class, ()->{
            memberService.join(member2); // 예외가 발생해야 한다.
        });
    }
}