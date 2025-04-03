package com.study.springboot;

import org.springframework.stereotype.Component;

//자바 빈을 생성하는 방법 2가지
//1. @Confiration + @Bean
//2. @Component + @Autowired
//  1) 필드(field,멤버변수) 주입 : 일반적인 방법
//  2) 수정자(setter) 주입
//  3) 생성자(constructor) 주입 : 추천하는 방법
@Component
public class Member {
    private String name;
    //기본생성자 필수
    public Member() {
        this.name = "홍길동";
    }
    //getter / setter 필수
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
