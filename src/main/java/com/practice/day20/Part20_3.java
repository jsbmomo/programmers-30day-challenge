package com.practice.day20;

import java.util.Arrays;

public class Part20_3 {

  private static int solution(String[] arr) {
    int[] length = new int[30];

    for (String str : arr) {
      length[str.length()]++;
    }

    return Arrays.stream(length).max().getAsInt();
  }

  public static void main(String[] args) {
    String[] arr = new String[]{"a","bc","d","efg","hi"};

    System.out.println(solution(arr));
  }

}
