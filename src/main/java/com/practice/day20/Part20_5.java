package com.practice.day20;

import java.util.Arrays;

public class Part20_5 {

  private static int[] solution(int[] arr) {
    Arrays.sort(arr);

    return Arrays.copyOfRange(arr, 5, arr.length);
  }

  public static void main(String[] args) {
    int[] arr = new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10};

    Arrays.stream(solution(arr)).forEach(System.out::println);
  }

}
