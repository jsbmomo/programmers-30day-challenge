package com.practice.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part10_2 {

  private static int solution(String my_string, String is_prefix) {
    return my_string.startsWith(is_prefix) ? 1 : 0;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String my_string = br.readLine();
    String is_prefix = br.readLine();

    System.out.println(solution(my_string, is_prefix));
  }

}
