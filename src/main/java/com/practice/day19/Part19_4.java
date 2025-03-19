package com.practice.day19;

import java.util.ArrayList;
import java.util.Arrays;

public class Part19_4 {

  private static int[] solution(int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (answer.isEmpty()) {
        answer.add(arr[i]);
        continue;
      }

      if (arr[i] != answer.get(answer.size() - 1)) {
        answer.add(arr[i]);
        continue;
      }

      answer.remove(answer.size() - 1);
    }

    if (answer.isEmpty()) {
      return new int[] { -1 };
    }

    int[] values = new int[answer.size()];

    for (int i = 0; i < answer.size(); i++) {
      values[i] = answer.get(i);
    }

    return values;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 1, 1, 0, 0 };

    Arrays.stream(solution(arr)).forEach(System.out::println);
  }

}
