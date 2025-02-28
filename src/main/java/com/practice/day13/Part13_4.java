package com.practice.day13;

import java.util.Arrays;

public class Part13_4 {

  private static int[] solution(int[] num_list, int n) {
    return Arrays.copyOfRange(num_list, 0, n);
  }

  public static void main(String[] args) {
    int[] values = new int[] { 5, 2, 1, 7, 5 };
    int num = 3;

    Arrays.stream(solution(values, num)).forEach(System.out::println);
  }

}
