package com.practice.day18;

public class Part18_5 {

  private static String solution(String rny_String) {
    String[] chars = rny_String.split("");

    StringBuilder sb = new StringBuilder();

    for (String c : chars) {
      sb.append(c.equals("m") ? "rn" : c);
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(solution("masterpiece"));
  }

}
