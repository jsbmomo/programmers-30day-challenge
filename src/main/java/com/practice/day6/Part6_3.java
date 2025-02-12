package com.practice.day6;

public class Part6_3 {

  private static String solution(int[] numLog) {
    StringBuilder sb = new StringBuilder();

    for (int i = 1; i < numLog.length; i++) {
      int before = numLog[i - 1];

      if (numLog[i] == before + 1)
        sb.append("w");
      else if (numLog[i] == before - 1)
        sb.append("s");
      else if (numLog[i] == before + 10)
        sb.append("d");
      else if (numLog[i] == before - 10)
        sb.append("a");
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    int[] ary = new int[] { 0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1 };

    System.out.println(solution(ary));
  }

}
