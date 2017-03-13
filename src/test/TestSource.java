package test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestSource extends Thread {
  
  /** * @param args */
  public static void main(String[] args) {
    testIterator();
//     //testC019の検証
//     String perfect = "perfect";
//     String nearly = "nearly";
//     String neither = "neither";
//     Integer input = 0;
//     Integer amari = 0;
//     Integer yakusuSum = 0;
//     ArrayList<Integer> inputList = new ArrayList<Integer>();
//     ArrayList<String> dispList = new ArrayList<String>();
//    
//     input = 28;
//     while(input >= 2) {
//       input = input / 2;
//       amari = input % 2;
//       System.out.print(String.valueOf(input + amari) + " ");
//     }
    
    // Split
    // testMethod1();

    // ゼロ埋め
    // testMethod2();

    // 型桁チェック
    // testMethod3();
  }

  /**
   * split
   */
  private static void testMethod1() {
    /** 読込領域 */
    String readArea = "CAPL000000000001,CAPL000000000002,CAPL000000000003,CAPL000000000004,CAPL000000000005,CAPL000000000006,CAPL000000000007,CAPL000000000008,CAPL000000000009,CAPL000000000010,CAKT000000000001,CAKT000000000002,CAKT000000000003,CAKT000000000004,CAKT000000000005,CAKT000000000006,CAKT000000000007,CAKT000000000008,CAKT000000000009,CAKT000000000010,CAPR000000000001,CAPR000000000002,CAPR000000000003,CAPR000000000004,CAPR000000000005,CAPR000000000006,CAPR000000000007,CAPR000000000008,CAPR000000000009,CAPR000000000010,CARK000000000001,CARK000000000002,CARK000000000003,CARK000000000004,CARK000000000005,CARK000000000006,CARK000000000007,CARK000000000008,CARK000000000009,CARK000000000010,CAKS000000000001,CAKS000000000002,CAKS000000000003,CAKS000000000004,CAKS000000000005,CAKS000000000006,CAKS000000000007,CAKS000000000008,CAKS000000000009,,CAKS000000000010";
    // String LINE_SEPARATOR_PATTERN = "\r\n|[\n\r\u2028\u2029\u0085]";
    String[] readAreaSplit = readArea.split(",", 0);
    ArrayList<String> readAreaArray = new ArrayList<String>();
    for (String val : readAreaSplit) {
      if (!val.isEmpty())
        readAreaArray.add(val);
    }

    for (String val : readAreaArray) {
      System.out.println(val);
    }
  }

  /**
   * ゼロ埋め
   */
  private static void testMethod2() {
    String dateStr = "20170307";

    System.out.println("zeroPaddingStr : " + String.format("%032d", Integer.parseInt(dateStr)));
  }

  /**
   * 型桁チェック
   */
  private static void testMethod3() {

    // 判定する文字列
    String str = "CAPL00000000A001";

    // 判定するパターンを生成
    Pattern p = Pattern.compile("^[0-9A-Z]+$");
    Matcher m = p.matcher(str);

    if (str.length() != 16 || !m.find()) {
      System.out.println("型桁チェックNG");
    } else {
      System.out.println("型桁チェックOK");
    }

  }

  // C030:白にするか黒にするか
  private static void testC030() {
    // String[][] inputStr = new String[3][2];
    // Scanner sc2=null;
    // for (int i=0; i < 3; i++) {
    // System.out.println("グレースケールを入力");
    // sc2 = new Scanner(System.in);
    // inputStr[i][0] = sc2.next();
    // inputStr[i][1] = sc2.next();
    // }
    // sc2.close();

    System.out.println("大きさを入力");
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    String[][] inputStr = new String[N][M];
    System.out.println("グレースケールを入力");

    for (int i = 0; i < N; i++) {
      sc = new Scanner(System.in);
      for (int j = 0; j < M; j++) {
        if (sc.hasNext()) {
          inputStr[i][j] = sc.next();
        }
      }
      // inputStr[i][0] = sc.next();
      // inputStr[i][1] = sc.next();
    }
    sc.close();
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

    // for (int k = 0; k < N; k++) {
    // if(inputStr[k].equals("128")) {
    // System.out.print("1");
    // } else if(inputStr[k].equals("127")) {
    // System.out.print("0");
    // }
    // if (k < N) {
    // System.out.print(" ");
    // }
    // if (k == N-1) {
    // System.out.println("");
    // }
    // }

    // String[] inputStr = {"3 2", "128 127", "127 128", "128 127"};
    // String[] hwStr = inputStr[0].split(" ");
    //
    // for(int i=1; i < inputStr.length; i++) {
    // String[] colorStr = inputStr[i].split(" ");
    // if (colorStr.length < 2) {
    // continue;
    // }
    // for(int j=0; j < colorStr.length; j++) {
    // if(colorStr[j].equals("128")) {
    // System.out.print("1");
    // } else if(colorStr[j].equals("127")) {
    // System.out.print("0");
    // }
    // if (j==0) {
    // System.out.print(" ");
    // } else {
    // System.out.println("");
    // }
    //
    // }
    // }
    //
    // String inputStr = "0";
    // Integer inputInt = Integer.parseInt(inputStr);
    // if (inputInt >= 1) {
    // System.out.print(String.valueOf(inputInt * 3));
    // } else {
    // System.out.print("1");
    // }

    // String inputStr = "2 3 5";
    // String[] input = inputStr.split(" ");
    // String[] hina = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    // Integer hinaIdx = 0;
    // for (int i=0; i < input.length; i++) {
    // Integer inputCnt = Integer.parseInt(input[i].toString());
    // for (int j=0; j < inputCnt; j++) {
    // System.out.print(hina[hinaIdx]);
    // hinaIdx++;
    // }
    // System.out.println("");
    // }
  }

  /**
   * 全角英数を半角英数へ変換する。
   * 
   * @param s
   * @return 変換文字列
   */
  private static String zenkakuAlphabetToHankaku(String s) {
    StringBuffer sb = new StringBuffer(s);
    for (int i = 0; i < sb.length(); i++) {
      char c = sb.charAt(i);
      if (c >= 'ａ' && c <= 'ｚ') {
        sb.setCharAt(i, (char) (c - 'ａ' + 'a'));
      } else if (c >= 'Ａ' && c <= 'Ｚ') {
        sb.setCharAt(i, (char) (c - 'Ａ' + 'A'));
      }
    }
    return sb.toString();
  }

  /**
   * Iteratorの検証
   */
  private static void testIterator() {
    Map hm1 = new HashMap();
    String[] tel = {"092", "06", "052", "03", "011"};
    String[] area = {"Fukuoka", "Osaka", "Nagoya", "Tokyo", "Hokkaido"};

    // 要素をHashMapへ追加
    for (int i=0; i<5; i++) {
      hm1.put(tel[i], area[i]);
    }
   
    // MapのKeyを代入
    Set map_ite1 = hm1.keySet();
    
    for (Iterator i=map_ite1.iterator(); i.hasNext();) {
      System.out.println("KeyのIterator : " + i.next());
    }
    
    // Mapの値を代入
    Collection map_ite2 = hm1.values();
    
    for (Iterator i=map_ite2.iterator(); i.hasNext();) {
      System.out.println("値のIterator : " + i.next());
    }
    
    // MapのKeyと値のペアを代入
    Set map_ite3 = hm1.entrySet();
    for (Iterator i=map_ite3.iterator(); i.hasNext();) {
      System.out.println("Keyと値のペアのIterator : " + i.next());
    }

  }
  
}
