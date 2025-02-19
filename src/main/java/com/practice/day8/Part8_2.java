package com.practice.day8;

import java.util.Arrays;

public class Part8_2 {

  public static int solution(int a, int b, int c, int d) {
    int[] arr = new int[] { a, b, c, d };

    Arrays.sort(arr);

    if (a == b && b == c && c == d)
      return 1111 * a;

    int[] count = new int[Arrays.stream(arr).max().getAsInt() + 1];

    for (int num : arr) {
      count[num]++;
    }

    for (int i = 1; i < count.length; i++) {
      if (count[i] == 3) {
        int p = i;
        int q = 0;

        for (int j = 1; j < count.length; j++) {
          if (count[j] == 1) {
            q = j;
            break;
          }
        }

        return (int)Math.pow((10 * p + q), 2);
      }

      if (count[i] == 2) {
        int p = i;
        int q = 0, r = 0;

        for (int j = 1; j < count.length; j++) {
          if (p == j)
            continue;

          if (count[j] == 2) {
            q = j;
            break;
          }
          if (count[j] == 1 && q != 0) {
            r = j;
            break;
          }
          if (count[j] == 1)
            q = j;
        }

        return r == 0
          ? (p + q) * Math.abs(p - q)
          : q * r;
      }
    }

    return Arrays.stream(arr).min().getAsInt();
  }

  public static void main(String[] args) {
    System.out.println(solution(4, 5, 2, 6));
  }
}
