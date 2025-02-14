package com.practice.day6;

import java.util.Arrays;

public class Part6_4 {

  private static int[] solution(int[] arr, int[][] queries) {
    int[] answer = Arrays.copyOf(arr, arr.length);

    Arrays.stream(queries)
        .forEach(query -> {
          int temp = answer[query[0]];
          answer[query[0]] = answer[query[1]];
          answer[query[1]] = temp;
        });

    return answer;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 0, 1, 2, 3, 4 };
    int[][] queries = new int[][] { {0, 3},{1, 2},{1, 4} };

    Arrays.stream(solution(arr, queries)).forEach(System.out::print);
  }

}
