package com.practice.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part10_5 {

  private static String solution(int q, int r, String code) {
    StringBuilder sb = new StringBuilder();

    // for (int i = r; i < code.length(); i += q
    for (int i = 0; i < code.length(); i++) {
      if (i % q == r)
        sb.append(code.charAt(i));
    }

    return sb.toString();
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int q = Integer.parseInt(br.readLine());
    int r = Integer.parseInt(br.readLine());
    String code = br.readLine();

    System.out.println(solution(q, r, code));
  }
}
