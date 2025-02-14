package com.practice.day7;

import java.util.Arrays;

public class Part7_1 {

  private static int[] solution(int[] arr, int[][] queries) {
    int[] answer = Arrays.copyOf(arr, arr.length);
    final int length = arr.length;

    for (int[] query : queries) {
      for (int i = 0; i < length; i++) {
        if (i < query[0] || query[1] < i)
          continue;
        if (i % query[2] == 0)
          answer[i]++;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 0, 1, 2, 4, 3 };
    int[][] queries = new int[][] { {0, 4, 1},{0, 3, 2},{0, 3, 3} };

    Arrays.stream(solution(arr, queries)).forEach(System.out::print);
  }

}
