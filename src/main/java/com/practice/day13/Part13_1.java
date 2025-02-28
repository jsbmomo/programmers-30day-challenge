package com.practice.day13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Part13_1 {

  private static int[] solution(int[] num_list, int n) {
    return Arrays.copyOfRange(num_list, n, num_list.length);
  }

  public static void main(String[] args) {
    int[] num_list = new int[] { 2, 1, 6 };
    int n = 1;

    Arrays.stream(solution(num_list, n)).forEach(System.out::println);
  }

}
