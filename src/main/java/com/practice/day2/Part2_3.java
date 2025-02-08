package com.practice.day2;

import java.util.Scanner;

public class Part2_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();

    StringBuilder sb = new StringBuilder();

    for (char c : a.toCharArray()) {
      sb.append(c).append("\n");
    }

    System.out.println(sb.toString());
  }
}
