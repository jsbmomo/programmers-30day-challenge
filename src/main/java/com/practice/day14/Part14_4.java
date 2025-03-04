package com.practice.day14;

public class Part14_4 {

  private static int solution(int[] numbers, int n) {
    int answer = 0;

    for (int number : numbers) {
      answer += number;

      if (answer > n)
        break;
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] values = new int[] { 34, 5, 71, 29, 100, 34 };
    int n = 123;

    System.out.println(solution(values, 123));
  }

}
