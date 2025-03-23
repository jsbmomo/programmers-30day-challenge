package com.practice.day20;

import java.util.Arrays;

public class Part20_5 {

  private static int[] solution(int[] arr) {
    Arrays.sort(arr);

    return Arrays.copyOf(arr, 5);
  }

  public static void main(String[] args) {
    int[] arr = new int[]{12, 4, 15, 46, 38, 1, 14};

    Arrays.stream(solution(arr)).forEach(System.out::println);
  }

}
