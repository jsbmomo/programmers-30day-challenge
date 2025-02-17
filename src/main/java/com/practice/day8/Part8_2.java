package com.practice.day8;

import java.util.Arrays;

public class Part8_2 {

  public static int solution(int a, int b, int c, int d) {
    int[] arr = new int[] { a, b, c, d };

    if (a == b && b == c && c == d)
      return 1111 * a;

    if (a != b && b != c && c != d && a != d)
      return Arrays.stream(arr).min().getAsInt();

    int pow1 = getPow(a, b, c, d);
    int pow2 = getPow(a, b, d, c);
    int pow3 = getPow(a, c, d, b);
    int pow4 = getPow(b, c, d, a);

    if (pow1 > 0 || pow2 > 0 || pow3 > 0 || pow4 > 0) {
      int[] values = new int[] { pow1, pow2, pow3, pow4 };
      return Arrays.stream(values).max().getAsInt();
    }

    int multiAbs1 = getMultipleWithAbs(a, b, c, d);
    int multiAbs2 = getMultipleWithAbs(a, c, b, d);
    int multiAbs3 = getMultipleWithAbs(a, d, c, b);

    if (multiAbs1 > 0 || multiAbs2 > 0 || multiAbs3 > 0) {
      int[] values = new int[] { pow1, pow2, pow3, pow4 };
      return Arrays.stream(values).max().getAsInt();
    }

    int multi1 = getMultiple(a, b, c, d);
    int multi2 = getMultiple(a, c, b, d);
    int multi3 = getMultiple(a, d, c, b);
    int multi4 = getMultiple(b, c, a, d);
    int multi5 = getMultiple(b, d, a, c);
    int multi6 = getMultiple(c, d, a, b);

    int[] multiValues = new int[] { multi1, multi2, multi3, multi4, multi5, multi6 };
    return Arrays.stream(multiValues).max().getAsInt();
  }

  private static int getPow(int p1, int p2, int p3, int q) {
    return p1 == p2 && p2 == p3 && p3 != q
        ? (int)Math.pow((10 * p1 + q), 2)
        : -1;
  }

  private static int getMultipleWithAbs(int p1, int p2, int q1, int q2) {
    return p1 == p2 && q1 == q2
        ? (p1 + q1) * Math.abs(p2 - q2)
        : -1;
  }

  private static int getMultiple(int p1, int p2, int q, int r) {
    return p1 == p2 && q != r
        ? q * r
        : -1;
  }

  public static void main(String[] args) {
    System.out.println(solution(2, 5, 2, 6));
  }
}
