package com.ohgiraffers.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        System.out.println(("main method"));

        ApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfig.class);

        MemberService memberService
                = context.getBean("memberService", MemberService.class);

        System.out.println("================selectMembers 호출==================");
        System.out.println("실행결과 :" + memberService.selectMembers());
        System.out.println();
        System.out.println("================selectMember 호출===================");
        System.out.println("실행결과 :" + memberService.selectMember(100L));



    }

}
