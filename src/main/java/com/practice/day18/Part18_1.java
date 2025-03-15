package com.practice.day18;

import java.util.Arrays;

public class Part18_1 {

  private static int[] solution(String my_string) {
    String[] answer = my_string.split("x", -1);
    int[] length = new int[answer.length];

    for (int i = 0; i < answer.length; i++) {
      length[i] = answer[i].length();
    }

    return length;
  }

  public static void main(String[] args) {
    Arrays.stream(solution("oxooxoxxox")).forEach(System.out::println);
  }

}
