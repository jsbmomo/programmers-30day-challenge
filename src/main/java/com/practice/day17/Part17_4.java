package com.practice.day17;

import java.util.Arrays;

public class Part17_4 {

  private static String[] solution(String myString) {
    return myString.split(" ");
  }

  public static void main(String[] args) {
    Arrays.stream(solution("i love you")).forEach(System.out::println);
  }

}
