package com.practice.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part9_5 {

  private static int solution(String my_string, String is_suffix) {
    // endsWith() 로 끝내기 가능.

    if (!my_string.contains(is_suffix))
      return 0;

    for (int i = my_string.length() - 1; i >= 0; i--) {
      if (my_string.substring(i).equals(is_suffix))
        return 1;
    }

    return 0;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println(solution(br.readLine(), br.readLine()));

    br.close();
  }
}
