package com.practice.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part3_2 {

  public static String solution(String[] arr) {
    StringBuilder answer = new StringBuilder();

    for (String s : arr) {
      answer.append(s);
    }

    return answer.toString();
  }

  /* 로컬 실행을 위해 임의 추가 */
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());

    String[] inputs = new String[count];

    for (int i = 0; i < count; i++) {
      inputs[i] = br.readLine();
    }

    System.out.println(solution(inputs));

    br.close();
  }

}
