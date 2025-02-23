package com.practice.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Part11_4 {

  private static int[] solution(int start_num, int end_num) {
    int[] answer = new int[start_num - end_num + 1];

    for (int i = 0; i <= start_num - end_num; i++)
      answer[i++] = start_num - i;

    return answer;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int start_num = Integer.parseInt(br.readLine());
    int end_num = Integer.parseInt(br.readLine());

    Arrays.stream(solution(start_num, end_num)).forEach(num -> System.out.print(num + ", "));

    br.close();
  }

}
