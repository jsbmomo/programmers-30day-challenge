package com.practice.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part5_2 {

  private static int solution(int a, int b, boolean[] included) {
    int answer = 0;

    for (int i = 0; i < included.length; i++) {
      if (included[i]) {
        answer += a + (b * i);
      }
    }

    return answer;

    // IntStream.range(0, included.length).map(idx -> included[idx]?a+(idx*d):0).sum()
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    boolean[] included = new boolean[] {true, false, false, true, true};

    System.out.println(solution(a, b, included));

    br.close();
  }

}
