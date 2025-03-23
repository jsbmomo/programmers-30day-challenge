package com.practice.day20;

import java.util.Arrays;

public class Part20_2 {

  private static int solution(int[] arr1, int[] arr2) {
    if (arr1.length > arr2.length)
      return 1;

    if (arr1.length < arr2.length)
      return -1;

    int sum1 = Arrays.stream(arr1).sum();
    int sum2 = Arrays.stream(arr2).sum();

    if (sum1 != sum2)
      return sum1 > sum2 ? 1 : -1;

    return 0;
  }

  public static void main(String[] args) {
    int[] arr1 = new int[]{100, 17, 84, 1};
    int[] arr2 = new int[]{55, 12, 65, 36};

    System.out.println(solution(arr1, arr2));
  }

}
