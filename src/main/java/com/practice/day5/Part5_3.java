package com.practice.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part5_3 {

  private static int solution(int a, int b, int c) {
    int sum = a + b + c;

    if (a == b && b == c) {
      return sum * ((a * a) + (b * b) + (c * c)) *
          ((a * a * a) + (b * b * b) + (c * c * c));
    }

    if (a == b || b == c || a == c) {
      return sum * ((a * a) + (b * b) + (c * c));
    }

    return sum;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());

    System.out.println(solution(a, b, c));

    br.close();
  }

}
