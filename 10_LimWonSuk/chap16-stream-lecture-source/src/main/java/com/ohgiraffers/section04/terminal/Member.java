package com.ohgiraffers.section04.terminal;

public class Member {

    private String memberId;
    private String memberName;

    // 생성자 지정
    public Member() {
    }

    // 클래스 필드에 생성자 메개변수 생성
    public Member(String memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    // ID 값 읽기
    public String getMemberId() {
        return memberId;
    }


    // ID 값 바꾸기
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }


    // 이름 읽기
    public String getMemberName() {
        return memberName;
    }


    // 이름 바꾸기
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    // @Override → 부모 클래스(Object)에 있는 toString()을 덮어쓰기
    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", memberName='" + memberName + '\'' +
                '}';
    }
}