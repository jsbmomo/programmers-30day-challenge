package com.practice.day17;

public class Part17_2 {

  private static int solution(String myString, String pat) {
    int answer = 0;
    int length = myString.length();

    for (int i = 0; i < length; i++) {
      if (myString.substring(i, length).startsWith(pat))
        answer++;
    }

    return answer;
  }

  public static void main(String[] args) {
    String myString = "banana";
    String pat = "aaaa";

    System.out.println(solution(myString, pat));
  }

}
