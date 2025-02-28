package com.practice.day13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Part13_2 {

  private static int[] solution1(int[] num_list, int n) {
    int[] ints1 = Arrays.copyOfRange(num_list, 0, n - 1);
    int[] ints2 = Arrays.copyOfRange(num_list, n, num_list.length);

    return IntStream.concat(Arrays.stream(ints2), Arrays.stream(ints1)).toArray();
  }

  private static int[] solution2(int[] num_list, int n) {
    int[] answer = new int[num_list.length];
    int index = 0;

    for (int i = n; i < num_list.length; i++) {
      answer[index++] = num_list[i];
    }

    for (int i = 0; i < n; i++) {
      answer[index++] = num_list[i];
    }

    return answer;
  }

  private static int[] solution3(int[] num_list, int n) {
    int[] answer = new int[num_list.length];
    int secondIndex = num_list.length - n;

    System.arraycopy(num_list, n, answer, 0, secondIndex);
    System.arraycopy(num_list, 0, answer, secondIndex, n);

    return answer;
  }

  public static void main(String[] args) {
    int[] values = new int[] { 5, 2, 1, 7, 5 };
    int number = 3;

    Arrays.stream(solution3(values, number)).forEach(System.out::println);
  }

}
