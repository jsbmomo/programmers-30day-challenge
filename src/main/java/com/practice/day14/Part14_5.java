package com.practice.day14;

import java.util.Arrays;

public class Part14_5 {

  private static int[] solution(int[] arr, int[][] queries) {
    for (int[] indexes : queries) {
      for (int i = indexes[0]; i <= indexes[1]; i++) {
        arr[i]++;
      }
    }

    return arr;
  }

  public static void main(String[] args) {
    int[] values = new int[] { 0, 1, 2, 3, 4 };
    int[][] queries = new int[][] { {0,1}, {1,2}, {2,3} };

    Arrays.stream(solution(values, queries)).forEach(System.out::println);
  }


}
