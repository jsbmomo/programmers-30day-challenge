package com.practice.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part4_5 {

  private static int solution(int a, int b, boolean flag) {
    return flag ? a + b : a - b;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println(solution(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()), true));

    br.close();
  }
}
