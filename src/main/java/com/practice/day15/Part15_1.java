package com.practice.day15;

import java.util.Arrays;

public class Part15_1 {

  private static int[] solution(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= 50 && arr[i] % 2 == 0) {
        arr[i] /= 2;
        continue;
      }

      if (arr[i] < 50 && arr[i] % 2 == 1) {
        arr[i] *= 2;
      }
    }

    return arr;
  }

  public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 3, 100, 99, 98};

    Arrays.stream(solution(arr)).forEach(System.out::println);
  }

}
