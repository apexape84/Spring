package com.ohgiraffers.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PersonalAccount implements Account{

    private final int bankCode;
    private final String accNo;
    private int balance;

    public PersonalAccount(int bankCode, String accNo) {
        this.bankCode = bankCode;
        this.accNo = accNo;
    }

    @Override
    public String getBalance() {
        return this.accNo + " 계좌의 잔액은 " + this.balance;
    }

    @Override
    public String deposit(int money) {
        String str = "";
        if(money >= 0){
            this.balance += money;
            str = money + " 원이 입급되었습니다";
        }else str = "잘못된 입금입니다";

        return str;
    }

    @Override
    public String withdraw(int money) {
        String str = "";
        if(this.balance >= money){
            this.balance -= money;
            str = money + "원이 출금되었습니다";
        } else str = "잔액이 부족합니다";
        return str;
    }
}
