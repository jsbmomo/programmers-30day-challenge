package com.practice.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Part7_5 {

  /**
   * Stack 은 Vector 상속하고 있어서 문제가 있기때문에
   * 자바 doc에 Deque인터페이스의 ArrayDeque 구현체를 스택과 큐로 사용하는 것을 권장
   */
  public static int[] solution(int[] arr) {
    Stack<Integer> stk = new Stack<>();

    int index = 0;

    while (index < arr.length) {
      if (stk.isEmpty()) {
        stk.add(arr[index++]);
        continue;
      }
      if (stk.peek() < arr[index]) {
        stk.add(arr[index++]);
        continue;
      }
      stk.pop();
    }

    int[] result = new int[stk.size()];
    int resultIdx = stk.size() - 1;

    while (!stk.isEmpty()) {
      result[resultIdx--] = stk.pop();
    }

    return result;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] arr = new int[] { 1, 4, 2, 5, 3 };

    Arrays.stream(solution(arr)).forEach(System.out::println);

    br.close();
  }

}
