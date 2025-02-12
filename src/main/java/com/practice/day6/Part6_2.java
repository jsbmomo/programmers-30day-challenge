package com.practice.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part6_2 {

  private static int solution(int n, String control) {
    for (char c : control.toCharArray()) {
      // JDK12 부터 사용가능
      switch (c) {
        case 'w' -> ++n;
        case 's' -> --n;
        case 'd' -> n += 10;
        case 'a' -> n -= 10;
      }
    }
    return n;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println(solution(Integer.parseInt(br.readLine()), br.readLine()));

    br.close();
  }

}
