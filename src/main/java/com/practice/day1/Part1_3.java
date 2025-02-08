package com.practice.day1;

import java.util.Scanner;

public class Part1_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = sc.nextInt();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      sb.append(str);
    }

    System.out.println(sb.toString());
  }
}
