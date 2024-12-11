package com.ohgiraffers.section01.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {
    @Bean
    public Account account() {
        return new PersonalAccount(20,"650725-967-100245");
    }

    @Bean
    public MemberDTO memberDTO() {
        return new MemberDTO(1,"이승현","apexape@anver.com",account());
    }
}
