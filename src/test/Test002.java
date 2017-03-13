package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Test002 {
  /** システム日付フォーマット：yyyyMMddHHmm */
  private final static String SYSDATE_YYYYMMDDHHMM = "yyyyMMddHHmm";
  
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    int day = cal.get(Calendar.DATE);
    day++;
    cal.set(Calendar.DATE, day);
    System.out.print(parseCalToStr(cal, SYSDATE_YYYYMMDDHHMM));
    
  }

  /**
   * システム時間を取得する
   * 
   * @param dateType 日付フォーマット
   * @return システム日
   */
  public static String getSysDate(String dateType) {
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat(dateType);
    return sdf.format(date);
  }

  /**
   * Calendar型⇒String型への変換処理
   * 
   * @param  cal 変換前カレンダー型オブジェクト
   * @return String型オブジェクト（変換に失敗した場合はnullを返します。）
   */
public static String parseCalToStr(Calendar cal, String pattern){
  String  str;
  if(cal == null) {
    str = null;
  } else {
    str = new SimpleDateFormat(pattern).format(cal.getTime());
  }
  return str;
}
}
