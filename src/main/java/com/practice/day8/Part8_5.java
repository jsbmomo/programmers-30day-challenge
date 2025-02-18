package com.practice.day8;

public class Part8_5 {

  public static String solution(String my_string, int[][] queries) {
    char[] word = my_string.toCharArray();

    for (int[] query : queries) {
      int start = query[0];
      int end = query[1];

      char temp = ' ';

      for (int i = start; i < end; i++) {
        if (start >= end)
          break;

        temp = word[start];
        word[start++] = word[end];
        word[end--] = temp;
      }
    }

    return String.valueOf(word);
  }

  public static void main(String[] args) {
    int[][] queries = { {2, 3}, {0, 7}, {5, 9}, {6, 10} };

    System.out.println(solution("rermgorpsam", queries));
  }

}
