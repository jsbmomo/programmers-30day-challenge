package com.practice.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part10_4 {

  private static String solution(String my_string, int m, int c) {
    StringBuilder sb = new StringBuilder();

    int count = 0;

    for (int i = 0; i < my_string.length(); i++) {
      count++;

      if (i % m == 0)
        count = 1;

      if (count == c)
        sb.append(my_string.charAt(i));
    }

    return sb.toString();
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String my_string = br.readLine();
    int m = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());

    System.out.println(solution(my_string, m, c));
  }

}
