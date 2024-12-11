package com.ohgiraffers.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MemberService {

    private final MemberDAO memberDAO;

    /* 생성자 주입으로 Bean 들과의 의존성 생성 */
    @Autowired
    public MemberService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    // 전체조회 하는 DAO 로직 호출하는 구문
    public Map<Long, MemberDTO> selectMembers() {
        System.out.println("서비스 selectMembers 에서 DAO의 selectAllMembers호출했어");

        return memberDAO.selectAllMembers();
    }

    // 회원번호로 조회하는 DAO 로직 호출하는 구문
    public MemberDTO selectMember(Long no) {
        System.out.println("서비스 selectMember에서 DAO의 selectMembersByNo호출했어\"");

        return memberDAO.selectMemberByNo(no);
    }

}