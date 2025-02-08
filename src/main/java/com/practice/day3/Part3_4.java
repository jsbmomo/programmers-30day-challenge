package com.practice.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part3_4 {

  private static int solution(int a, int b) {
    String strA = String.valueOf(a);
    String strB = String.valueOf(b);

    int value1 = Integer.parseInt(strA + strB);
    int value2 = Integer.parseInt(strB + strA);

    return Math.max(value1, value2);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println(solution(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())));

    br.close();
  }

}
