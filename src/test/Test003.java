package test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test003 {
  public static void main(String[] args)
  {
    try {

      // 前画面で入力されたバーコードを、改行コード区切りで配列に格納する。
      String[] readAreaSplit = { "000000000001", "000000000002", "000000000003", "000000000004",
          "000000000005", "000000000006", "000000000007", "000000000008", "000000000009",
          "000000000010", "000000000011", "000000000012", "000000000013", "000000000014",
          "000000000015", "000000000016", "000000000017", "000000000018", "000000000019",
          "000000000020", "000000000021", "000000000022", "000000000023", "000000000024",
          "000000000025", "000000000026", "000000000027", "000000000028", "000000000029",
          "000000000030", "000000000031", "000000000032", "000000000033", "000000000034",
          "000000000035", "000000000036", "000000000037", "000000000038", "000000000039",
          "000000000040", "000000000041", "000000000042", "000000000043", "000000000044",
          "000000000045", "000000000046", "000000000047", "000000000048", "000000000049",
          "000000000050" };
      
      // 全件数
      Integer rowCnt = 0;
      // 正常件数
      Integer normalCnt = 0;
      // 異常件数
      Integer errCnt = 0;
      // 連結バーコード(10件、カンマ区切り)
      String barcodeStr = "";
      // 連結処理区分(10件、カンマ区切り)
      String processingDivision = "";
      // 1度に処理する件数
      Integer processingCnt = 10;

      // バーコード連結処理
      for (int i = 0; i < readAreaSplit.length - 1;) {
        for (int j = 0; j < processingCnt; j++) {
          // レスポンスを考慮し、10件ずつ検査を行う。
          String singleBarcode = readAreaSplit[j];
          // 読み込まれたバーコードが全角文字の場合は、半角文字に変換する。
          singleBarcode = zenkakuNumToHankaku(singleBarcode);
          rowCnt++;

          // 重複チェック
          for (int k = 0; k < readAreaSplit.length - 1; k++) {
            // チェック対象の行は除外
            if (k == rowCnt - 1)
              continue;

            // 入力されたコードが既に他行に存在する場合にエラーとする。
            String overlapCheckStr = readAreaSplit[k];
            if (singleBarcode.equals(overlapCheckStr)) {
              
              break;
            }
          }
          processingDivision = processingDivision + singleBarcode.substring(0, 4) + ",";
          barcodeStr = barcodeStr + singleBarcode + ",";
          i = i + rowCnt;
        }
        // 末尾1文字を削除
        processingDivision = processingDivision.substring(0, processingDivision.length()-1);
        barcodeStr = barcodeStr.substring(0, barcodeStr.length()-1);
        System.out.println(processingDivision);
        System.out.println(barcodeStr);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  /**
   * 全角数字を半角に変換します。
   * 
   * @param s 変換元文字列
   * @return 変換後文字列
   */
  public static String zenkakuNumToHankaku(String s) {
    StringBuffer sb = new StringBuffer(s);
    for (int i = 0; i < sb.length(); i++) {
      char c = sb.charAt(i);
      if (c >= '０' && c <= '９') {
        sb.setCharAt(i, (char) (c - '０' + '0'));
      }
    }
    return sb.toString();
  }
  
  public static String zenkakuAlphabetToHankaku(String s) {
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
}
