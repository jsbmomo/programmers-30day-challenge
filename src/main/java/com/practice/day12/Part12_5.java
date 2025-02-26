package com.practice.day12;

import java.util.Arrays;

public class Part12_5 {

  private static int[] solution(int[] arr, int[] query) {
    int[] values = arr.clone();

    for (int i = 0; i < query.length; i++) {
      values = i % 2 == 0
        ? Arrays.copyOfRange(values, 0, query[i] + 1)
        : Arrays.copyOfRange(values, query[i], values.length);
    }

    return values;
  }

  public static void main(String[] args) {
    int[] arr = {0, 1, 2, 3, 4, 5};
    int[] query = {4, 1, 2};

    Arrays.stream(solution(arr, query)).forEach(System.out::println);
  }

}
