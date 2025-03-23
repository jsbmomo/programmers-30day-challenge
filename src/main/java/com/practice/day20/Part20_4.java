package com.practice.day20;

import java.util.Arrays;

public class Part20_4 {

  private static int[] solution(int[] arr, int n) {
    int start = arr.length % 2 == 0 ? 1 : 0;

    for (int i = start; i < arr.length; i += 2) {
      arr[i] += n;
    }

    return arr;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{444, 555, 666, 777};

    Arrays.stream(solution(arr, 100)).forEach(System.out::println);
  }

}
