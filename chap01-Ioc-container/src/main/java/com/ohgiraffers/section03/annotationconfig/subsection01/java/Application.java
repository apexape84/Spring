package com.ohgiraffers.section03.annotationconfig.subsection01.java;

import com.ohgiraffers.common.MemberDAO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();

        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

        MemberDAO memberDAO = (MemberDAO) context.getBean("memberDAO", MemberDAO.class);
        System.out.println(memberDAO.getMember(1));
        System.out.println(memberDAO.getMember(2));
        System.out.println(memberDAO.insertMember(new MemberDTO(3,"user03", "pass03","하츄핑")));
        System.out.println(memberDAO.getMember(3));
    }
}
