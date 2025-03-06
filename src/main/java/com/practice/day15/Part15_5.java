package com.practice.day15;

import java.util.Arrays;

public class Part15_5 {

  private static int solution(String myString, String pat) {
    return myString.toUpperCase().contains(pat.toUpperCase()) ? 1 : 0;
  }

  public static void main(String[] args) {
    String myString = "AbCdEfG";
    String pat = "aBc";

    System.out.println(solution(myString, pat));
  }

}
