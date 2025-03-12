package com.practice.day17;

public class Part17_1 {

  private static String solution(String myString, String pat) {
    int index = myString.lastIndexOf(pat) + pat.length();

    return myString.substring(0, index);
  }

  public static void main(String[] args) {
    String myString = "AbCdEFG";
    String pat = "dE";

    System.out.println(solution(myString, pat));
  }


}
