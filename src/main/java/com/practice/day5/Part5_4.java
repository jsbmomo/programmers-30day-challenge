package com.practice.day5;

public class Part5_4 {

  private static int solution(int[] num_list) {
    int mul = 1;
    int sum = 0;

    for (int num : num_list) {
      mul *= num;
      sum += num;
    }

    return mul < (sum * sum) ? 1 : 0;
  }

  public static void main(String[] args) {
    int[] ary = new int[] {3, 4, 5, 2, 1};

    System.out.println(solution(ary));
  }
}
