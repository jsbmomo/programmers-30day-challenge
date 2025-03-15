package com.practice.day17;

import java.util.ArrayList;
import java.util.Arrays;

public class Part17_5 {

  private static String[] solution(String my_string) {
    ArrayList<String> answer = new ArrayList<>();

    for (String str : my_string.split(" ")) {
      if (!str.isEmpty())
        answer.add(str);
    }

    return answer.toArray(new String[0]);

    // 정규식 사용 시.
    // my_string.trim().split("[ ]+"); // or split("\\s+")
  }

  public static void main(String[] args) {
    Arrays.stream(solution(" i    love  you")).forEach(System.out::println);
  }

}
