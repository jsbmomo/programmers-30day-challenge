package com.practice.day20;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Part20_3 {

  private static int solution(String[] arr) {
    Map<Integer, Integer> answer = new HashMap<>();

    for (String str : arr) {
      if (answer.get(str.length()) == null) {
        answer.put(str.length(), 1);
        continue;
      }

      answer.put(str.length(), answer.get(str.length()) + 1);
    }

    return Collections.max(answer.values());
  }

  public static void main(String[] args) {
    String[] arr = new String[]{"a","bc","d","efg","hi"};

    System.out.println(solution(arr));
  }

}
