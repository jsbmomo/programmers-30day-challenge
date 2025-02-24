package com.practice.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class Part12_3 {

  private static int[] solution(int[] arr, int[][] intervals) {
    ArrayList<Integer> answer = new ArrayList<>();

    for (int[] indexes : intervals) {
      for (int i = indexes[0]; i <= indexes[1]; i++)
        answer.add(arr[i]);
    }

    return answer.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int[][] intervals = {{1, 3}, {0, 4}};

    Arrays.stream(solution(arr, intervals)).forEach(System.out::println);
  }
}
