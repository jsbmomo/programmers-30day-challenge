package com.practice.day8;

import java.util.Arrays;

public class Part8_4 {

  public static int solution(String number) {
    int sum = 0;

    for (char c : number.toCharArray()) {
      sum += c - '0';
    }

    return sum % 9;
  }

  public static void main(String[] args) {
    System.out.println(solution("78720646226947352489"));
  }

}
