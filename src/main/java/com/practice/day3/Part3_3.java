package com.practice.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part3_3 {
  public static String solution(String my_string, int k) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < k; i++) {
      sb.append(my_string);
    }

    // 다른 사람 풀이 : my_string.repeat(k);
    return sb.toString();
  }

  /* 로컬 실행을 위해 임의 추가 */
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println(solution(br.readLine(), Integer.parseInt(br.readLine())));

    br.close();
  }
}
