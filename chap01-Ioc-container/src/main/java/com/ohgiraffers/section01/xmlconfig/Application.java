package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

        MemberDTO member1 = (MemberDTO) context.getBean("member1");
        System.out.println("member1 = " + member1);

//        MemberDTO member2 = context.getBean(MemberDTO.class);
//        System.out.println("member2 = " + member2);

        MemberDTO member3 = context.getBean("member2", MemberDTO.class);
        System.out.println("member3 = " + member3);
    }
}
