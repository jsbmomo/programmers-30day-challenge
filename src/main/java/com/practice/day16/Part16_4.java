package com.practice.day16;

import java.util.Arrays;

public class Part16_4 {

  private static String solution(String myString) {
    char[] chArr = myString.toCharArray();

    for (int i = 0; i < chArr.length; i++) {
      if (chArr[i] == 'a') {
        chArr[i] = 'A';
        continue;
      }

      if (chArr[i] >= 'B' && chArr[i] <= 'Z') {
        chArr[i] = (char)(chArr[i] + 32);
      }
    }

    //// Best...
    // return myString.toLowerCase().replace('a', 'A');

    return String.valueOf(chArr);
  }

  public static void main(String[] args) {
    String myString = "zZdavZwQZaasdfAS!#@"; //""PrOgRaMmErS";

    System.out.println(solution(myString));
  }

}
