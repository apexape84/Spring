package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Member;

@Configuration("configuration02")
public class ContextConfiguration {
    @Bean(name="member")
    public MemberDTO getMember() {
        return new MemberDTO(2, "user02", "pass02", "팽팽");
    }
}
