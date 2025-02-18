package com.practice.day9;

import java.util.ArrayList;
import java.util.Arrays;

public class Part9_1 {

  private static int[] solution(String[] intStrs, int k, int s, int l) {
    ArrayList<Integer> answer = new ArrayList<>();

    StringBuilder sb = new StringBuilder();

    for (String str : intStrs) {
      char[] chars = str.toCharArray();

      for (int i = s; i < s + l; i++) {
        sb.append(chars[i]);
      }

      int range = Integer.valueOf(sb.toString());

      if (k < range)
        answer.add(range);

      sb.setLength(0);
    }

    return answer.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {
    String[] values = { "0123456789","9876543210","9999999999999" };

    Arrays.stream(solution(values, 5, 5, 50000)).forEach(System.out::println);
  }
}
