package com.practice.day6;

public class Part6_1 {

  private static int[] solution(int[] num_list) {
    int[] answer = new int[num_list.length + 1];

    for (int i = 0; i < num_list.length; i++) {
      answer[i] = num_list[i];
    }

    int val1 = num_list[num_list.length - 2];
    int val2 = num_list[num_list.length - 1];

    answer[answer.length - 1] = val1 < val2 ? val2 - val1 : val2 * 2;

    return answer;
  }

  public static void main(String[] args) {
    int[] ary = new int[] { 5, 2, 1, 7, 5 };

    System.out.println(solution(ary));
  }

}
