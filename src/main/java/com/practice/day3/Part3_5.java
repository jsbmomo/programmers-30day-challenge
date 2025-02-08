package com.practice.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part3_5 {

  public int solution(int a, int b) {
    String strA = Integer.toString(a);
    String strB = Integer.toString(b);

    return Math.max(Integer.valueOf(strA + strB), 2 * a * b);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println(solution(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())));

    br.close();
  }

}
