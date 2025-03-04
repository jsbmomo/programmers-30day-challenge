package com.practice.day14;

import java.util.ArrayList;
import java.util.Arrays;

public class Part14_2 {

  private static String[] solution(String[] names) {
    ArrayList<String> answer = new ArrayList<>();
    int count = 0;

    for (String name : names) {
      count++;

      if (count % 5 == 1) {
        answer.add(name);
      }
    }

    return answer.stream().toArray(String[]::new);
  }

  public static void main(String[] args) {
    String[] values = new String[] { "nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx" };

    Arrays.stream(solution(values)).forEach(System.out::println);
  }

}
