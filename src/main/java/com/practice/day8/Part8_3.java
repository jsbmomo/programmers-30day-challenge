package com.practice.day8;

import java.util.Arrays;

public class Part8_3 {

  public static String solution(String my_string, int[] index_list) {
    StringBuilder sb = new StringBuilder();

    Arrays.stream(index_list).forEach(idx -> sb.append(my_string.charAt(idx)));

    return sb.toString();
  }

  public static void main(String[] args) {
    int[] indexes = new int[] {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7 };
    System.out.println(solution("cvsgiorszzzmrpaqpe", indexes));
  }
}
