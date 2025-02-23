package com.practice.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Part11_1 {

  private static int[] solution(String my_string) {
    char[] alpha = my_string.toCharArray();
    int[] answer = new int[52];

    for (char c : alpha) {
      int index = c < 'a' ? c - 65 : (c - 97) + 26;
      answer[index]++;
    }

    return answer;
  }


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Arrays.stream(solution(br.readLine())).forEach(num -> System.out.print(num + ", "));

    br.close();
  }

}
