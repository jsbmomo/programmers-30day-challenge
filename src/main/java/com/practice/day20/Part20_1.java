package com.practice.day20;

import java.util.Arrays;

public class Part20_1 {

  private static int[] solution(int[] arr) {
    int max = 1;

    while (arr.length >= max) {
      if (arr.length == max)
        return arr;

      max *= 2;
    }

    return Arrays.copyOf(arr, max);
  }

  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4, 5, 6};

    Arrays.stream(solution(arr)).forEach(System.out::println);
  }

}
