package com.practice.day19;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Part19_3 {

  private static int[] solution(int[] arr, boolean[] flag) {
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < arr.length; i++) {
      if (flag[i]) {
        int max = arr[i] * 2;

        for (int j = 0; j < max; j++) {
          stack.add(arr[i]);
        }
        continue;
      }

      for (int j = 0; j < arr[i]; j++) {
        stack.pop();
      }
    }

    Collections.reverse(stack);

    int size = stack.size();
    int[] answer = new int[size];

    for (int i = 0; i < size; i++) {
      answer[i] = stack.pop();
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 3, 2, 4, 1, 3 };
    boolean[] flag = new boolean[] { true, false, true, false, false };

    Arrays.stream(solution(arr, flag)).forEach(System.out::println);
  }

}
