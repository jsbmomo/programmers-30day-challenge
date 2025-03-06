package com.practice.day15;

import java.util.Arrays;

public class Part15_4 {

  private static int solution(int[] num_list) {
    if (num_list.length >= 11) {
      int sum = 0;

      for (int num : num_list) {
        sum += num;
      }

      return sum;
    }

    int multiple = 1;

    for (int num : num_list) {
      multiple *= num;
    }

    return multiple;
  }

  public static void main(String[] args) {
    int[] num_list = new int[] { 3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1 };

    System.out.println(solution(num_list));
  }

}
