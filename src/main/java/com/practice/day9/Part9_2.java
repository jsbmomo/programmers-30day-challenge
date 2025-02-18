package com.practice.day9;

import java.util.Arrays;

public class Part9_2 {

  private static String solution(String[] my_strings, int[][] parts) {
    StringBuilder sb = new StringBuilder();

    int len = my_strings.length;

    for (int i = 0; i < len; i++) {
      sb.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String[] values = { "progressive", "hamburger", "hammer", "ahocorasick" };
    int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};

    System.out.println(solution(values, parts));
  }
}
