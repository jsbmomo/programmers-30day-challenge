package com.practice.day14;

import java.util.ArrayList;
import java.util.Arrays;

public class Part14_3 {

  private static String[] solution(String[] todo_list, boolean[] finished) {
    if (todo_list.length != finished.length)
      return null;

    ArrayList<String> answer = new ArrayList<>();

    for (int i = 0; i < finished.length; i++) {
      if (!finished[i]) {
        answer.add(todo_list[i]);
      }
    }

    /* 참고(로직 개선)
    StringBuilder str = new StringBuilder();

    for (int i = 0; i < finished.length; i++) {
      str.append(!finished[i] ? "," + todo_list[i] : "");
    }

    return str.toString().split(",");
    */

    return answer.stream().toArray(String[]::new);
  }

  public static void main(String[] args) {
    String[] todo_list = new String[] { "problemsolving", "practiceguitar", "swim", "studygraph" };
    boolean[] finished = new boolean[] { true, false, true, false };

    Arrays.stream(solution(todo_list, finished)).forEach(System.out::println);
  }

}
