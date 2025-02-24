package com.practice.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class Part12_1 {

  private static int[] solution(int n, int[] slicer, int[] num_list) {
    ArrayList<Integer> answer = new ArrayList<>();

    int startIndex = 0;
    int endIndex = 0;
    int interval = 1;

    switch(n) {
      case 1:
        startIndex = 0;
        endIndex = slicer[1];
        break;
      case 2:
        startIndex = slicer[0];
        endIndex = num_list.length - 1;
        break;
      case 3:
        startIndex = slicer[0];
        endIndex = slicer[1];
        break;
      case 4:
        startIndex = slicer[0];
        endIndex = slicer[1];
        interval = slicer[2];
        break;
    }

    for (int i = startIndex; i <= endIndex; i += interval) {
      answer.add(num_list[i]);
    }

    return answer.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {
    int n = 3;
    int[] slicer = new int[] {1, 5, 2};
    int[] num_list = new int[] {1,2,3,4,5,6,7,8,9};

    Arrays.stream(solution(n, slicer, num_list)).forEach(System.out::println);
  }
}
