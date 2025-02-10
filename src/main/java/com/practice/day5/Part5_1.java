package com.practice.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part5_1 {

  private static String solution(String code) {
    StringBuilder ret = new StringBuilder();
    int mode = 0;

    char[] codeToChar = code.toCharArray();

    for (int i = 0; i < codeToChar.length; i++) {
      if (codeToChar[i] == '1') {
        mode = mode == 0 ? 1 : 0;
        continue;
      }

      if (i % 2 == mode) {
        ret.append(codeToChar[i]);
      }
    }

    return ret.isEmpty() ? "EMPTY" : ret.toString();
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println(solution(br.readLine()));

    br.close();
  }
}
