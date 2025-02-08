package com.practice.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part2_5 {

  private static String solution(String my_string, String overwrite_string, int s) {
    String answer = my_string.substring(0, s);
    String remain = my_string.substring(s + overwrite_string.length());

    return answer + overwrite_string + remain;
  }

  /* 로컬 실행을 위해 임의 추가 */
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String originStr = br.readLine();
    String compareStr = br.readLine();
    int index = Integer.parseInt(br.readLine());

    System.out.println(solution(originStr, compareStr, index));

    br.close();
  }

}
