package com.practice.day1;

import java.util.Scanner;

public class Part1_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();

    char[] result = new char[a.length()];

    for (int i = 0; i < a.length(); i++) {
      char c = a.charAt(i);

      result[i] = (char)(c < 'a' ? c + 32 : c - 32);
    }

    System.out.println(String.valueOf(result));

    sc.close();
  }
}
