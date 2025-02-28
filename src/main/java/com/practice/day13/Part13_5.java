package com.practice.day13;

import java.util.Arrays;

public class Part13_5 {

  private static int[] solution(int[] num_list, int n) {
    int size = (num_list.length + n - 1) / n;
    int[] answer = new int[size];
    int index = 0;

    for (int i = 0; i < num_list.length; i += n) {
      if (n > num_list.length)
        break;

      answer[index++] = num_list[i];
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] values = new int[] { 4, 2, 6, 1, 7, 6 };
    int num = 2;

    Arrays.stream(solution(values, num)).forEach(System.out::println);
  }

}
