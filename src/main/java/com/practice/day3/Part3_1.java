package com.practice.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part3_1 {

  public static String solution(String str1, String str2) {
    int index = 0;

    char[] answer = new char[str1.length() + str2.length()];

    char[] strCharAry1 = str1.toCharArray();
    char[] strCharAry2 = str2.toCharArray();

    for (int i = 0; i < str1.length(); i++) {
      answer[index++] = strCharAry1[i];
      answer[index++] = strCharAry2[i];
    }

    return String.valueOf(answer);
  }

  /* 로컬 실행을 위해 임의 추가 */
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String str2 = br.readLine();

    System.out.println(solution(str1, str2));

    br.close();
  }

}
