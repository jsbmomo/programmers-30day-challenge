package com.practice.day2;

import java.util.Scanner;

public class Part2_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.printf("%d is %s", n, n % 2 == 0 ? "even" : "odd");
  }
}
