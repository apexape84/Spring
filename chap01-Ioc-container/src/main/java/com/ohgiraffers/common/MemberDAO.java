package com.ohgiraffers.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemberDAO {
    private final Map<Integer,MemberDTO> memberMap;

    public MemberDAO() {
        memberMap = new HashMap<>();

        memberMap.put(1,new MemberDTO(1,"user01","pass01","일승현"));
        memberMap.put(2,new MemberDTO(2,"user02","pass02","이승현"));
    }

    public MemberDTO getMember(int no) {
        return memberMap.get(no);
    }

    public boolean insertMember(MemberDTO newMember) {
        int before = memberMap.size();
        memberMap.put(newMember.getNo(),newMember);
        int after = memberMap.size();
        return after > before ? true : false;
    }
}
