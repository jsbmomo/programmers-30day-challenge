package com.practice.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Part9_4 {

  private static String[] solution(String my_string) {
    String[] values = new String[my_string.length()];

    for (int i = values.length - 1; i >= 0; i--) {
      values[i] = my_string.substring(i);
    }

    Arrays.sort(values);

    return values;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Arrays.stream(solution(br.readLine())).forEach(System.out::println);
  }

}
