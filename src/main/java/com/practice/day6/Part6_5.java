package com.practice.day6;

import java.util.Arrays;

public class Part6_5 {
  /**
   * 이번 문제는 시간이 조금 걸렸습니다.
   * 해서 문제 정보와 사용한 테스트 케이스 데이터를 남겨놓습니다.
   *
   * - 문제
   *   정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
   *   queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
   *   각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
   *   각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
   *   단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다
   *
   * - 수동 추가한 테스트 케이스
   *     arr                              queries                             Returns
   *  a) [1, 2, 3, 4, 5, 6]               [[1, 3, 2], [2, 4, 3]]              [3, 4]
   *  b) [1, 2, 3, 4, 5, 6]               [[1, 3, 10], [3, 5, 10]]            [-1, -1]
   *  c) [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]  [[1, 8, 10], [3, 3, 3], [6, 8, 6]]  [-1, 4, 7]
   *  d) [1, 11, 2, 3]                    [[0, 3, 1]]                         [2]
   *  e) [5, 2, 1, 45, 2, 145, 6]         [[1, 3, 2], [2, 4, 3], [3, 5, 100]] [45, 45, 145]
   *
   * @link https://school.programmers.co.kr/learn/courses/30/lessons/181923
   */
  private static int[] solution(int[] arr, int[][] queries) {
    int[] answer = new int[queries.length];

    final int MAX = 1_000_000;
    int index = 0;
    int length = arr.length;

    for (int[] query : queries) {
      int min = MAX;

      for (int i = 0; i < length; i++) {
        if (query[0] > i || i > query[1])
          continue;

        if (query[2] < arr[i] && arr[i] < min)
          min = arr[i];
      }

      answer[index++] = min != MAX ? min : -1;
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 0, 1, 2, 4, 3 };
    int[][] queries = new int[][] { {0, 4, 2},{0, 3, 2},{0, 2, 2} };

    Arrays.stream(solution(arr, queries)).forEach(System.out::print);
  }

}
