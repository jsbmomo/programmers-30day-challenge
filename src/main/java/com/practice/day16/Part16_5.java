package com.practice.day16;

public class Part16_5 {

  private static String solution(String myString, String alp) {
    char c = alp.charAt(0);

    return myString.replace(c, (char)(c - 32));
  }

  public static void main(String[] args) {
    String myString = "programmers";
    String alp = "p";

    System.out.println(solution(myString, alp));
  }

}
