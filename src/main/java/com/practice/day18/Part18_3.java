package com.practice.day18;

import java.util.Arrays;

public class Part18_3 {

  private static int solution(String binomial) {
    String[] values = binomial.split(" ");
    int a = Integer.parseInt(values[0]);
    int b = Integer.parseInt(values[2]);

    if (values[1].equals("+")) {
      return a + b;
    }

    if (values[1].equals("-")) {
      return a - b;
    }

    return a * b;
  }

  public static void main(String[] args) {
    System.out.println(solution("40000 * 40000"));
  }

}
