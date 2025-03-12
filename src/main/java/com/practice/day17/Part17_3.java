package com.practice.day17;

import java.util.ArrayList;
import java.util.Arrays;

public class Part17_3 {

  private static String[] solution(String[] strArr) {
    ArrayList<String> arr = new ArrayList<>();

    for (String str : strArr) {
      if (!str.contains("ad"))
        arr.add(str);
    }

    return arr.toArray(new String[0]);
  }

  public static void main(String[] args) {
    String[] arr = new String[] {"there","are","no","a","ds"};

    Arrays.stream(solution(arr)).forEach(System.out::println);
  }

}
