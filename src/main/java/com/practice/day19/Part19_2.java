package com.practice.day19;

import java.util.Arrays;

public class Part19_2 {

  private static int[] solution(int[] arr) {
    int size = Arrays.stream(arr).sum();
    int[] answer = new int[size];

    int index = 0;

    for (int value : arr) {
      for (int j = 0; j < value; j++) {
        answer[index++] = value;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 5, 1, 4 };

    Arrays.stream(solution(arr)).forEach(System.out::println);
  }

}
