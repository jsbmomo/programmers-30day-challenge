package com.practice.day16;

import java.util.Arrays;

public class Part16_3 {

  private static String[] solution(String[] strArr) {
    for (int i = 0; i < strArr.length; i++) {
      strArr[i] = i % 2 == 0
          ? strArr[i].toLowerCase()
          : strArr[i].toUpperCase();
    }

    return strArr;
  }

  public static void main(String[] args) {
    String[] strArr = new String[] { "AAA","BBB","CCC","DDD" };

    Arrays.stream(strArr).forEach(System.out::println);
  }

}
