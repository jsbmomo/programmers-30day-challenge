package com.practice.day15;

import java.util.Arrays;

public class Part15_2 {

  private static int VALUE = 50;

  private static int solution(int[] arr) {
    for (int count = 1; count <= 100; count++) {
      int[] newArr = Arrays.copyOf(arr, arr.length);

      for (int i = 0; i < newArr.length; i++) {
        if (newArr[i] >= VALUE && newArr[i] % 2 == 0) {
          newArr[i] /= 2;
          continue;
        }

        if (newArr[i] < VALUE && newArr[i] % 2 == 1) {
          newArr[i] *= 2;
          newArr[i]++;
        }
      }

      if (Arrays.equals(newArr, arr))
        return count - 1;

      arr = Arrays.copyOf(newArr, newArr.length);
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 1, 2, 3, 100, 99, 98 };

    System.out.println(solution(arr));
  }
}
