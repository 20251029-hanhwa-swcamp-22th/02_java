package com.wjdqudwls.section03.references;

public class Member {
  public static void main(String[] args) {

  }
  private String memberId;

  public Member(String memberId) {
    this.memberId = memberId;
  }

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  @Override
  public String toString() {
    return "Member{" +
        "memberId='" + memberId + '\'' +
        '}';
  }
}
