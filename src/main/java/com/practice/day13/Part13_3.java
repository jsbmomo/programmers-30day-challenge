package com.practice.day13;

import java.util.ArrayList;
import java.util.Arrays;

public class Part13_3 {

  private static String[] solution(String[] str_list) {
    for (int i = 0; i < str_list.length; i++) {
      if (str_list[i].equals("l")) {
        return Arrays.copyOfRange(str_list, 0, i);
      }

      if (str_list[i].equals("r")) {
        return Arrays.copyOfRange(str_list, i + 1, str_list.length);
      }
    }

    return new String[0];
  }

  public static void main(String[] args) {
    String[] values = new String[] { "u", "u", "l", "r" };
    // String[] values = new String[] { "t", "v", "e", "l", "l", "t" }; // result : ["t", "v", "e"]
    // String[] values = new String[] { "l", "l", "l", "l", "t" }; // result : []
    // String[] values = new String[] { "r", "l", "l", "t" }; // result : ["l", "l", "t"]

    Arrays.stream(solution(values)).forEach(System.out::println);
  }

}
