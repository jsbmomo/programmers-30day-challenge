package com.practice.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Part7_3 {

  private static int[] solution(int start_num, int end_num) {
    int[] answer = new int[end_num - start_num + 1];

    for (int val = start_num; val <= end_num; val++) {
      answer[val - start_num] = val;
    }

    return answer;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int start = Integer.parseInt(br.readLine());
    int end = Integer.parseInt(br.readLine());

    Arrays.stream(solution(start, end)).forEach(System.out::println);
  }

}
