package com.practice.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part11_2 {

  private static String solution(String my_string, int[] indices) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < my_string.length(); i++) {
      boolean isContain = false;

      for (int index : indices) {
        if (index == i) {
          isContain = true;
          break;
        }
      }

      if (!isContain)
        sb.append(my_string.charAt(i));
    }

    return sb.toString();
  }


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String my_string = "apporoograpemmemprs";
    int[] indices = { 1, 16, 6, 15, 0, 10, 11, 3 };

    System.out.println(solution(my_string, indices));

    br.close();
  }

}
