package com.practice.day12;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Part12_4 {

  private static int[] solution(int[] arr) {
    int start = -1;
    int end = arr.length;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 2) {
        start = i;
        break;
      }
    }

    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] == 2) {
        end = i;
        break;
      }
    }

    if (start == -1 && end == arr.length)
      return new int[] { -1 };

    return IntStream.rangeClosed(start, end).map(i -> arr[i]).toArray();
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 1, 4, 5, 2, 9};
    // int[] arr = { 1, 2, 1 };

    Arrays.stream(solution(arr)).forEach(System.out::println);
  }

}