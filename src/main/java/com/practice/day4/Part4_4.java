package com.practice.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part4_4 {

  private static int solution(String ineq, String eq, int n, int m) {
    int answer = 0;

    if (ineq.equals("<") && n < m) {
      answer = 1;
    }

    if (ineq.equals(">") && n > m) {
      answer = 1;
    }

    if (eq.equals("=") && n == m) {
      answer = 1;
    }

    return answer;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String ineq = br.readLine();
    String eq = br.readLine();
    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());

    System.out.println(solution(ineq, eq, n, m));

    br.close();
  }

}
