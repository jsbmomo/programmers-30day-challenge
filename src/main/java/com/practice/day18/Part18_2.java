package com.practice.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Part18_2 {

  private static String[] solution(String my_string) {
    String[] answer = my_string.split("x");

    // Arrays.sort(answer, String.CASE_INSENSITIVE_ORDER);
    ArrayList<String> arrayList = new ArrayList<>();

    for (String str : answer) {
      if (!str.isEmpty()) {
        arrayList.add(str);
      }
    }

    Collections.sort(arrayList);

    return arrayList.toArray(new String[0]);
    // return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);
  }

  public static void main(String[] args) {
    Arrays.stream(solution("xaaaaxbbbbx")).forEach(System.out::println);
  }

}
