package com.practice.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part9_3 {

  private static String solution(String my_string, int n) {
    return my_string.substring(my_string.length() - n);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String my_string = br.readLine();
    int number = Integer.parseInt(br.readLine());

    System.out.println(solution(my_string, number));
  }
}
