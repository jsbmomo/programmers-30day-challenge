package com.practice.day18;

public class Part18_4 {

  private static int solution(String myString, String pat) {
    char[] str = myString.toCharArray();

    for (int i = 0; i < str.length; i++) {
      str[i] = str[i] == 'A' ? 'B' : 'A';
    }

    // myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
    return String.valueOf(str).contains(pat) ? 1 : 0;
  }

  public static void main(String[] args) {
    System.out.println(solution("ABBAA", "AABB"));
  }

}
