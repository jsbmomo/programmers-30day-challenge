package com.practice.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Part11_5 {

  private static int solution(int[] arr, int idx) {
    for (int i = idx; i < arr.length; i++) {
      if (arr[i] == 1) {
        return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] arr = {1, 0, 0, 1, 0, 0};
    int index = Integer.parseInt(br.readLine());

    System.out.println(solution(arr, index));

    br.close();
  }

}
