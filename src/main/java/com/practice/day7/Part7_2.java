package com.practice.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Part7_2 {

  private static int[] solution(int l, int r) {
    List<Integer> list = new ArrayList<>();

    for (int i = l; i <= r; i++) {
      if (i % 5 != 0)
        continue;

      int value = i;

      while (value > 10) {
        if (value % 5 == 0 || value % 10 == 0)
          value /= 10;
        else
          break;
      }

      if (value == 5 || value == 0)
        list.add(i);
    }

    return list.isEmpty()
        ? new int[] { -1 }
        : list.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int l = Integer.parseInt(br.readLine());
    int r = Integer.parseInt(br.readLine());

    Arrays.stream(solution(l, r)).forEach(System.out::println);
  }
}
