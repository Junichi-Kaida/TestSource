package test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test001 {
  public static void main(String[] args)
  {
    try {
      // 拡張for文
      System.out.println("-- -- -- -- -- --");
      System.out.println("【拡張for文】");
      int data[] = { 85, 72, 89, 54, 91 };
      for (int seiseki : data) {
        System.out.println(seiseki);
      }

      // カレンダークラス
      System.out.println("-- -- -- -- -- --");
      System.out.println("【カレンダークラスの使用】");
      Calendar calendar = Calendar.getInstance();
      String[] week_name = { "日曜日", "月曜日", "火曜日", "水曜日",
          "木曜日", "金曜日", "土曜日" };
      int year = calendar.get(Calendar.YEAR);
      int month = calendar.get(Calendar.MONTH) + 1;
      int day = calendar.get(Calendar.DATE);
      int hour = calendar.get(Calendar.HOUR_OF_DAY);
      int minute = calendar.get(Calendar.MINUTE);
      int second = calendar.get(Calendar.SECOND);
      int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;

      int day_of_year = calendar.get(Calendar.DAY_OF_YEAR);

      System.out.println("現在の日時は");
      System.out.println(year + "年" + month + "月" + day + "日");
      System.out.println("(" + week_name[week] + ")");
      System.out.println(hour + "時" + minute + "分" + second + "秒");

      System.out.println("今日は今年の" + day_of_year + "日目です");

      // 日付の加減算
      System.out.println("-- -- -- -- -- --");
      System.out.println("【日付の加減算】");

      System.out.println("日時を2005/12/30に設定します");
      calendar.set(2005, 11, 30);
      dispCalendar(calendar);

      System.out.println("日を1ずつ増加させます");
      for (int i = 0; i < 6; i++) {
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        dispCalendar(calendar);
      }

      System.out.println("日時を2006/1/31に設定します");
      calendar.set(2006, 0, 31);
      dispCalendar(calendar);

      System.out.println("月を1ずつ増加させます");
      for (int i = 0; i < 4; i++) {
        calendar.add(Calendar.MONTH, 1);
        dispCalendar(calendar);
      }

      // Listクラス
      System.out.println("-- -- -- -- -- --");
      System.out.println("【List】");
      List<String> list = new ArrayList<String>();
      list.add("10");
      list.add("15");
      list.add("20");
      // list.get(index)でlistの値を取得します。一番最初は0
      System.out.println(list.get(1));

      // Mapクラス
      System.out.println("-- -- -- -- -- --");
      System.out.println("【MAP】");

      Map<String, String> map = new HashMap<String, String>();
      // 以下map.put(key, value)で値をセット
      map.put("A", "100");
      map.put("B", "80");
      map.put("C", "60");
      map.put("D", "40");
      map.put("E", "20");

      // map.get(key)で指定したkeyのvalueを取得
      System.out.println(map.get("C"));

      // Setクラス
      System.out.println("-- -- -- -- -- --");
      System.out.println("【SET】");
      Set<String> set = new HashSet<String>();
      // 以下setに値を追加。同じ値は追加されない。以下の例ではAは一つだけ追加される。
      set.add("A");
      set.add("A");
      set.add("B");
      set.add("C");

      for (String val : set) {
        System.out.println(val);
      }

      // 大文字小文字区別なく２つの文字列が同じかどうか判定:equalsIgnoreCase
      System.out.println("-- -- -- -- -- --");
      System.out.println("【大文字小文字区別なく２つの文字列が同じかどうか判定】");
      String str1 = "Abcde";
      String str2 = "abcde";
      String str3 = "fghij";

      //「A.equalsIgnoreCase(B)」で、大文字小文字を区別せずAとBが同じ値かどうかを判定する。
      //str1とstr2は同じ値なので、true（「A」と「a」は同じとみなす）。
      System.out.println(str1.equalsIgnoreCase(str2));

      //str1とstr3は違う値なので、false。
      System.out.println(str1.equalsIgnoreCase(str3));
      
      // 辞書の順序で文字列の大小を比較：compareTo
      System.out.println("-- -- -- -- -- --");
      System.out.println("【辞書の順序で文字列の大小を比較】");
      String str5 = "def";
      String str6 = "abc";
      String str7 = "ghi";
      String str8 = "def";

      //「A.compareTo(B)」で、辞書の順序で文字列の大小を比較する。
      //AがBより辞書で先にくる場合は、0以下
      //AとBが同じ場合は、0
      //AがBより辞書で後にくる場合は、0以上
      //になる。

      //str1はstr2より後にくるので0以上になる。
      System.out.println(str5.compareTo(str6));

      //str1はstr3より先にくるので0以下になる。
      System.out.println(str5.compareTo(str7));

      //str1はstr4と同じなので0になる。
      System.out.println(str5.compareTo(str8));
      
      // 大文字小文字の変換：toLowerCase、toUpperCase
      System.out.println("-- -- -- -- -- --");
      System.out.println("【大文字小文字の変換】");      
      String str9 = "HELLO";
      String str10 = "world";

      //toLowerCase()で大文字を小文字に変換する。
      System.out.println(str9.toLowerCase());

      //toUpperCaseで小文字を大文字に変換する。
      System.out.println(str10.toUpperCase());
      
      // 一文字取得：charAt
      System.out.println("-- -- -- -- -- --");
      System.out.println("【一文字取得】");
      String str11 = "Hello World.";

      //charAt(int index)で文字列の中の一文字を取得する。
      //取得する文字は引数のindexで指定する。
      System.out.println(str11.charAt(0));
      
      // 文字列の一部を取得：substring
      System.out.println("-- -- -- -- -- --");
      System.out.println("【文字列の一部を取得】");
      String str12 = "Hello World.";

      //substring(int beginIndex, int endIndex)で文字列の中の一部を取得する。
      //取得する文字列は引数のindexで指定する。
      System.out.println(str12.substring(0, 5));

      // switch
      System.out.println("-- -- -- -- -- --");
      System.out.println("【switch】");
      int score = 4;//ここは1～5までの数字で自由に変えます。
      String result = null;

      switch (score) {
        case 5://scoreが5の時
          result = "A";
          break;
        case 4://scoreが4の時
          result = "B";
          break;
        case 3://scoreが3の時
          result = "C";
          break;
        case 2://scoreが2の時
          result = "D";
          break;
        case 1://scoreが1の時
          result = "E";
          break;
        default://scoreが上記以外の時
          break;
      }

      if (result != null) {
        System.out.println(result + "評価です。");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  private static void dispCalendar(Calendar calendar) {
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH) + 1;
    int day = calendar.get(Calendar.DATE);

    StringBuffer sb = new StringBuffer();
    sb.append("設定されている日時は");
    sb.append(year + "年" + month + "月" + day + "日");
    sb.append("です。");

    System.out.println(new String(sb));
  }

}
