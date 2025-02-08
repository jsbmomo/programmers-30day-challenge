package com.practice.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part4_3 {

  private static int solution(int n) {
    int sum = 0;

    if (n % 2 == 1) {
      for (int i = 1; i <= n; i+=2) {
        sum += i;
      }
      return sum;
    }

    for (int i = 0; i <= n; i+=2) {
      sum += (i * i);
    }

    return sum;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println(solution(Integer.parseInt(br.readLine())));

    br.close();
  }

}
