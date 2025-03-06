package com.practice.day15;

import java.util.Arrays;

public class Part15_3 {

  private static int solution(int[] num_list) {
    return Arrays.stream(num_list).map(v -> calculate(v)).sum();
  }

  private static int calculate(int value) {
    if (value == 1)
      return 0;

    if (value % 2 == 0)
      return 1 + calculate(value / 2);

    return 1 + calculate((value - 1)/ 2);
  }

  public static void main(String[] args) {
    int[] num_list = new int[] { 12, 4, 15, 1, 14 };

    System.out.println(solution(num_list));
  }

}
