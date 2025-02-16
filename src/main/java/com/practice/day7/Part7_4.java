package com.practice.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Part7_4 {

  private static int[] solution(int n) {
    List<Integer> answer = new ArrayList<>();
    answer.add(n);

    while (n > 1) {
      if (n % 2 == 0)
        n /= 2;
      else
        n = 3 * n + 1;
      answer.add(n);
    }

    return answer.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Arrays.stream(solution(Integer.parseInt(br.readLine()))).forEach(System.out::println);
  }


}
