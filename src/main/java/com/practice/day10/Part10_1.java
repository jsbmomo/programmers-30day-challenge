package com.practice.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part10_1 {

  private static String solution(String my_string, int n) {
    return my_string.substring(0, n);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String my_string = br.readLine();
    int count = Integer.parseInt(br.readLine());

    System.out.println(solution(my_string, count));
  }
}
