package com.practice.day19;

import java.util.ArrayList;
import java.util.Arrays;

public class Part19_1 {

  private static String[] solution(String myStr) {
    String[] answer = myStr.replace("a", " ")
        .replace("b", " ")
        .replace("c", " ")
        .split(" ");
    // replaceAll("[a|b|c]+", ",");

    ArrayList<String> ary = new ArrayList<>();

    for (String str : answer) {
      if (!str.isEmpty())
        ary.add(str);
    }

    if (ary.isEmpty())
      return new String[] {"EMPTY"};

    return ary.toArray(new String[0]);
  }

  public static void main(String[] args) {
    String str = "baconlettucetomato";

    Arrays.stream(solution(str)).forEach(System.out::println);
  }

}
