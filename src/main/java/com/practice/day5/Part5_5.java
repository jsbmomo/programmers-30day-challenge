package com.practice.day5;

public class Part5_5 {

  private static int solution(int[] num_list) {
    StringBuilder odd = new StringBuilder();
    StringBuilder even = new StringBuilder();

    for (int i = 0; i < num_list.length; i++) {
      if (num_list[i] % 2 == 0)
        even.append(num_list[i]);
      else
        odd.append(num_list[i]);
    }

    return Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
  }

  public static void main(String[] args) {
    int[] ary = new int[] {3, 4, 5, 2, 1};

    System.out.println(solution(ary));
  }

}
