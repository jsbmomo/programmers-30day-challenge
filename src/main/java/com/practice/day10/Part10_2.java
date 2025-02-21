package com.practice.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part10_2 {

  private static String solution(String my_string, int s, int e) {
    StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
    sb.reverse();
    return my_string.substring(0,s) + sb + my_string.substring(e + 1);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String my_string = br.readLine();
    int s = Integer.parseInt(br.readLine());
    int e = Integer.parseInt(br.readLine());

    System.out.println(solution(my_string, s, e));
  }

}
