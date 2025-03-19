package com.practice.day19;

import java.util.ArrayList;
import java.util.Arrays;

public class Part19_3 {

  private static int[] solution(int[] arr, boolean[] flag) {
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (flag[i]) {
        for (int j = 0; j < arr[i] * 2; j++) {
          list.add(arr[i]);
        }
        continue;
      }

      for (int j = 0; j < arr[i]; j++) {
        list.remove(list.size() - 1);
      }
    }

    int[] answer = new int[list.size()];

    for (int i = 0; i < list.size(); i++) {
      answer[i] = list.get(i);
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 3, 2, 4, 1, 3 };
    boolean[] flag = new boolean[] { true, false, true, false, false };

    Arrays.stream(solution(arr, flag)).forEach(System.out::println);
  }

}
