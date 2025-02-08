package com.practice.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part4_2 {

  private static int solution(int number, int n, int m) {
    return number % n == 0 && number % m == 0
        ? 1
        : 0;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());

    System.out.println(solution(num, n, m));

    br.close();
  }
}
