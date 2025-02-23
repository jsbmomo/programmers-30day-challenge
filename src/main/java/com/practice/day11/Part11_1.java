package com.practice.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Part11_1 {

  private static int[] solution(int n, int k) {
    int count = n / k;
    int[] values = new int[count];

    for (int i = 1; i <= count; i++)
      values[i - 1] = i * 3;

    return values;
  }


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int k = Integer.parseInt(br.readLine());

    Arrays.stream(solution(n, k)).forEach(num -> System.out.print(num + ", "));

    br.close();
  }

}
