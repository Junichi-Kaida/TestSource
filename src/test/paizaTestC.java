package test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class paizaTestC {

  /** * @param args */
  public static void main(String[] args) {

    testC019();
  }

  /**
   * C019:完全数とほぼ完全数
   */
  private static void testC019() {
//  N を 2 以上の整数とし、N の約数のうち N 自身を除いたものの和を S とします。 このとき 
//    ・N = S となるような N を完全数
//    ・|N-S| = 1 となるような N をほぼ完全数
//    と言うことにしましょう。ここで、|N-S| は N-S の絶対値を意味します。
//
//    たとえば、N = 28 のとき、28 の約数は 1, 2, 4, 7, 14, 28 なので、S = 1+2+4+7+14 = 28 となります。従って、28 は完全数です。 
//    また、N = 16 のときには S = 1+2+4+8 = 15 となるので、16 はほぼ完全数です。
//
//    入力された整数が完全数かほぼ完全数かそのいずれでもないかを判定するプログラムを作成してください。
    Scanner sc = new Scanner(System.in);
    String perfect = "perfect";
    String nearly = "nearly";
    String neither = "neither";
    Integer input = 0;
    Integer amari = 0;
    Integer yakusuSum = 0;
    Integer dispCount = sc.nextInt();
    ArrayList<Integer> inputList = new ArrayList<Integer>();
    ArrayList<String> dispList = new ArrayList<String>();
    
    // 入力値を取得し、inputListへ格納する。
    for (int i=0; i < dispCount; i++) {
      if (sc.hasNext()) {
        inputList.add(sc.nextInt());
      }      
    }
    
    // inputListの中身を全件演算してdispListへ格納する。
    for (int i=0; i < inputList.size(); i++) {
      ArrayList<Integer> calcList = new ArrayList<Integer>();
      yakusuSum = 0;
      
      // 入力値
      input = inputList.get(i);
      while(input <= 1) {
        amari = input % 2;
        input = input / 2;
        if (amari > 0) {
          input = input + amari;
        }
        System.out.print(input + " ");
        calcList.add(input);
      }
      // 約数の和を求める
      for (int j=0; j < calcList.size(); j++) {
        yakusuSum = yakusuSum + calcList.get(j); 
      }
      if (yakusuSum == input) {
        // 完全数
        dispList.add(perfect);
      } else if(input - yakusuSum == 1) {
        // ほぼ完全数
        dispList.add(nearly);
      } else {
        dispList.add(neither);
      }
    }
    
    // dispListを全件表示する。
    for (int i=0; i < dispList.size(); i++) {
      System.out.println(dispList.get(i));
    }
  }

  /**
   * C030:白にするか黒にするか
   */
  private static void testC030() {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    String[][] inputStr = new String[N][M];
    
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (sc.hasNext()) {
          inputStr[i][j] = sc.next();
        }
      }
    }
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (inputStr[i][j] == null) {
          continue;
        }

        if (Integer.parseInt(inputStr[i][j]) >= 128) {
          System.out.print("1");
        } else if (Integer.parseInt(inputStr[i][j]) < 128) {
          System.out.print("0");
        }
        if (j == M - 1) {
          System.out.println("");
        } else if (j < M) {
          System.out.print(" ");
        }
      }
    }
  }  
}
