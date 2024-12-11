package com.ohgiraffers.common;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MemberDTO {
    private int no;
    private String name;
    private String email;
    private Account personalAccount;
}
