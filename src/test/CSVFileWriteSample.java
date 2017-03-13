package test;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

// CSV作成サンプル
public class CSVFileWriteSample {

    public static void main(String args[]) {

        try {
            //出力先を作成する ※2番目の引数をtrueにすると追記モード、falseにすると上書きモード
            FileWriter fw = new FileWriter("C:\\kaida_work\\20161011_work\\test.csv", false);  //※１
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

            //内容を指定する
            pw.print("あああ");
            pw.print(",");
            pw.print("いいい");
            pw.print(",");
            pw.print("ううう");
            pw.println();

            pw.print("001");
            pw.print(",");
            pw.print("002");
            pw.print(",");
            pw.print("003");
            pw.println();

            //ファイルに書き出す
            pw.close();

            //終了メッセージを画面に出力する
            System.out.println("出力が完了しました。");

        } catch (IOException ex) {
            //例外時処理
            ex.printStackTrace();
        }
    }

}