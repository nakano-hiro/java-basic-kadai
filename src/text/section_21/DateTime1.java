package text.section_21;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime1 {

	public static void main(String[] args) {

		// 日時を扱うクラスについて

		// Dateクラス	現在日時が取得できる
		// Date Dateクラスのオブジェクト = new Date()

		//現在日時を取得する
		Date date = new Date();

		//現在日時を出力する
		System.out.println(date);

		// Calendarクラス	任意の日時を設定したり取得できる

		//Calendarクラスのオブジェクトを生成する
		// Calendar Calendarクラスのオブジェクト = Calendar.getInstance()
		Calendar calendar = Calendar.getInstance();

		//Dateクラスで日時を設定する
		// Calendarクラスのオブジェクト.setTime(Dateクラスのオブジェクト);
		calendar.setTime(date);

		//任意の年月日を取得して、出力する
		// Calendarクラスのオブジェクト.get(Calendarクラス.Calendarクラスのフィールド)
		System.out.println("年は" + calendar.get(Calendar.YEAR));
		System.out.println("月は" + calendar.get(Calendar.MONTH));// CalendarクラスのMONTHは0から始まるので、実行結果の1は2月を示します。
		System.out.println("日は" + calendar.get(Calendar.DATE));

		//任意の時分秒を取得して、出力する
		System.out.println("時間は" + calendar.get(Calendar.HOUR));
		System.out.println("分は" + calendar.get(Calendar.MINUTE));
		System.out.println("秒は" + calendar.get(Calendar.SECOND));

		// SimpleDateFormatクラス	Dateクラスのフォーマットを指定する
		// 初期値のフォーマットは、「yyyy/MM/dd H」

		//SimpleDateFormatクラスのコンストラクタを引数無しで実行する。
		//その結果、SimpleDateFormatクラスのオブジェクトを生成する。
		SimpleDateFormat format = new SimpleDateFormat();

		//取得した日時を、生成したSimpleDateFormatクラスのオブジェクトでフォーマットする
		System.out.println(format.format(date));

		// フォーマットを指定する場合

		//		y：年（西暦）
		//		M：月
		//		d：日
		//		h：時（12時間制）
		//		H：時（24時間制）
		//		m：分

		//SimpleDateFormatクラスのコンストラクタの引数に、特定のフォーマットを渡して実行する。
		//その結果、SimpleDateFormatクラスのオブジェクトを生成する。
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd");

		//取得した日時を、生成したSimpleDateFormatクラスのオブジェクトでフォーマットする
		System.out.println(format2.format(date));

	}

}
