package com.practice.day14;

import java.util.Arrays;

public class Part14_1 {

  private static int solution(int[] num_list) {
    int odd = 0, even = 0;

    // index가 0으로 시작하므로, index가 짝수면 홀수 번째 수에 해당
    for (int i = 0; i < num_list.length; i++) {
      if (i % 2 == 0) {
        odd += num_list[i];
        continue;
      }
      even += num_list[i];
    }

    return Math.max(odd, even);
  }

  public static void main(String[] args) {
    int[] values = new int[] { 4, 2, 6, 1, 7, 6 };

    System.out.println(solution(values));
  }

}
