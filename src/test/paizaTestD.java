package test;

import java.util.Scanner;

public class paizaTestD {

  /** * @param args */
  public static void main(String[] args) {
    
  }  
  
  /**
   * D002:数の比較
   */
  private static void testD002() {
    Scanner sc = new Scanner(System.in);
    Integer aStr = sc.nextInt();
    Integer bStr = sc.nextInt();
    String outputStr = "";
    if (aStr > bStr) {
      outputStr = String.valueOf(aStr);
    } else if (bStr > aStr) {
      outputStr = String.valueOf(bStr);
    } else if (aStr == bStr) {
      outputStr = "eq";
    }
    System.out.println(outputStr);
  }
  
  /**
   * D007:N倍の文字列
   */
  private static void testD007() {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();

    for (int i = 0; i < Integer.parseInt(line); i++) {
      System.out.print("*");
    }
  }

  /**
   * D055:ワインのキャッチコピー
   */
  private static void testD055() {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    
    System.out.println("Best in " + line);
  }
  
  /**
   * D056:かまくらづくり
   */
  private static void testD056() {
    Scanner sc = new Scanner(System.in);
    int r1 = sc.nextInt();
    int r2 = sc.nextInt();
    Double m = Math.pow(r1, 3) - Math.pow(r2, 3);
    int i = m.intValue();
    System.out.println(i);
  }

  /**
   * D058:初詣で
   */
  private static void testD058() {
    Scanner sc = new Scanner(System.in);
    int reiCnt1 = sc.nextInt();
    int hakuCnt = sc.nextInt();
    int reiCnt2 = sc.nextInt();
    String outStr = "";
    for (int i=0; i < reiCnt1; i++) {
      outStr = outStr + "A";
    }
    for (int i=0; i < hakuCnt; i++) {
      outStr = outStr + "B";
    }
    for (int i=0; i < reiCnt2; i++) {
      outStr = outStr + "A";
    }
    System.out.println(outStr);
  }
  /**
   * D059:トランプ占い
   */
  private static void testD059() {
    Scanner sc = new Scanner(System.in);
    String aStr = sc.next();
    String bStr = sc.next();
    String outputStr = "";
    if (aStr.equals("J") && bStr.equals("J")) {
      outputStr = aStr + " " + "Q";
    } else {
      outputStr = aStr + " " + bStr;
    }
    System.out.println(outputStr);
  }
  
  /**
   * D060:AボタンとBボタン
   */
  private static void testD060() {
    Scanner sc = new Scanner(System.in);
    Integer charactorIndex = 0;
    Integer aButtonInput = sc.nextInt();
    Integer bButtonInput = sc.nextInt();
    charactorIndex = charactorIndex + aButtonInput;
    charactorIndex = charactorIndex - bButtonInput;
    System.out.println(charactorIndex);
  }
  
  /**
   * D061:3倍返し？
   */
  private static void testD061() {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    Integer inputInt = Integer.parseInt(line);
    if (inputInt >= 1) {
      System.out.print(String.valueOf(inputInt * 3));
    } else {
      System.out.print("1");
    }
  }
  
  /**
   * D062:ひな祭り
   */
  private static void testD062() {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] input = line.split(" ");
    String[] hina = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
    Integer hinaIdx = 0;
    for (int i = 0; i < input.length; i++) {
      Integer inputCnt = Integer.parseInt(input[i].toString());
      for (int j = 0; j < inputCnt; j++) {
        System.out.print(hina[hinaIdx]);
        hinaIdx++;
      }
      System.out.println("");
    }
  }
  
}
