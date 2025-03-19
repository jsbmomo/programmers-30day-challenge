package com.practice.day19;

import java.util.ArrayList;
import java.util.Arrays;

public class Part19_5 {

  private static int[] solution(int[] arr, int k) {
    ArrayList<Integer> answer = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (answer.size() >= k)
        break;

      if (!answer.contains(arr[i]))
        answer.add(arr[i]);
    }

    if (answer.size() < k) {
      for (int i = answer.size(); i < k; i++) {
        answer.add(-1);
      }
    }

    return answer.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 0, 1, 1, 1, 1 };
    int k = 4;

    Arrays.stream(solution(arr, k)).forEach(System.out::println);
  }

}
