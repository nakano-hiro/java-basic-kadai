package text.section_22;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateeTime2 {

	public static void main(String[] args) {

		// 日時を扱うクラスについて＃２
		// 日付、時刻、日付と時刻を扱うクラスがそれぞれ分けてつかうには。

		
		
		//		LocalDateクラス	日付のみ扱うことができる

		//現在の日付を取得する
		// LocalDate.now()
		LocalDate date1 = LocalDate.now();
		//現在の日付を出力する
		System.out.println(date1);

		// 指定する場合
		// LocalDate.of(指定する年, 指定する月, 指定する日)
		LocalDate date2 = LocalDate.of(1999, 1, 2);
		//指定する日付を出力する
		System.out.println(date2);

		
		
		//		LocalTimeクラス	時刻のみ扱うことができる

		//現在時刻を取得する
		// LocalTime.now()
		LocalTime time1 = LocalTime.now();
		//現在時刻を出力する
		System.out.println(time1);

		//指定する時刻を取得する
		// LocalTime.of(指定する時, 指定する分, 指定する秒)
		LocalTime time2 = LocalTime.of(5, 10, 20);
		//指定する時刻を出力する
		System.out.println(time2);

		
		
		//		LocalDateTimeクラス	日付と時刻を扱うことができる

		//現在日時を取得する
		// LocalDateTime.now()
		LocalDateTime datetime1 = LocalDateTime.now();
		//現在日時を出力する
		System.out.println(datetime1);

		//指定する日時を取得する
		// LocalDateTime.of(指定する年, 指定する月, 指定する日, 指定する時, 指定する分, 指定する秒)
		LocalDateTime datetime2 = LocalDateTime.of(1999, 1, 2, 5, 10, 20);
		//指定する日時を出力する
		System.out.println(datetime2);

		
		
		// ≪日時でよく使う処理≫

		// 文字列型の日時を、日時を扱うクラスの型に指定

		//LocalDateTime型に指定する
		// LocalDateTime 変数名 = LocalDateTime.parse(日付を表す文字列T時刻を表す文字列);
		// 連結したい文字列を、「T」でつなぐ
		LocalDateTime dateTime2 = LocalDateTime.parse("1999-01-10T02:30:40");

		//LocalDateTime型に指定された変数の値を出力する
		System.out.println(dateTime2);

		// 日時を扱うクラスの型の値を文字列型に指定

		//	      y	年を示す
		//	      M	月を示す
		//	      d	日を示す
		//	      H	0時から23時を示す
		//	      m	分を示す
		//	      s	秒を示す
		//		  h	1時から12時を表す(15時の場合、3となります)

		//日時を取得する
		LocalDateTime datetime3 = LocalDateTime.of(1999, 1, 2, 5, 10, 20);

		//指定するフォーマットでDateTimeFormatterクラスのオブジェクトを生成する
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

		//取得した日時を、生成したDateTimeFormatterクラスのオブジェクトでフォーマットする
		String afterFormat = datetime3.format(formatter);

		//フォーマットした日時を出力する
		System.out.println(afterFormat);

		
		
		// ≪日時の比較≫

		LocalDateTime dateTime4 = LocalDateTime.of(1999, 01, 10, 02, 30, 40);
		LocalDateTime dateTime5 = LocalDateTime.of(2000, 02, 20, 03, 40, 50);
		LocalDateTime dateTime6 = LocalDateTime.of(1999, 01, 10, 02, 30, 40);

		//日付が比較対象の日付より後の日付か判定する 
		// ※Time4はTime5より前の日付なので出力されない
		if (dateTime4.isAfter(dateTime5)) {
			System.out.println("日付が比較対象の日付より後の日付です");
		}

		//日付が比較対象の日付より前の日付か判定する 
		if (dateTime4.isBefore(dateTime5)) {
			System.out.println("日付が比較対象の日付より前の日付です");
		}

		//日付が比較対象の日付と等しい日付か判定する 
		if (dateTime4.isEqual(dateTime6)) {
			System.out.println("日付が比較対象の日付と同じ日付です");
		}

		
		
		// ≪日付の加算減算≫

		//指定する日付を取得する
		LocalDate date7 = LocalDate.of(1999, 1, 2);

		//指定する日付を出力する
		System.out.println(date7);
		//指定する日付に1年加算して出力する
		System.out.println("1年後は" + date7.plusYears(1));
		//指定する日付に1月加算して出力する
		System.out.println("1月後は" + date7.plusMonths(1));
		//指定する日付に5日加算して出力する
		System.out.println("5日後は" + date7.plusDays(5));

		//指定する日付に1年減算して出力する
		System.out.println("1年前は" + date7.minusYears(1));
		//指定する日付に1月減算して出力する
		System.out.println("1月前は" + date7.minusMonths(1));
		//指定する日付に5日減算して出力する
		System.out.println("5日前は" + date7.minusDays(5));

		
		
		// ≪日付の差分の取得≫

		// Period.between(取得した日時.toLocalDate(), 差分を求める日時.toLocalDate());

		//			getYears	年の差分を求める
		//			getMonths	月の差分を求める
		//			getDays	日の差分を求める

		LocalDateTime dateTime8 = LocalDateTime.of(1999, 01, 10, 02, 30, 40);
		LocalDateTime dateTime9 = LocalDateTime.of(2000, 03, 20, 03, 40, 50);

		//年月日の差分を求める
		Period period = Period.between(dateTime8.toLocalDate(), dateTime9.toLocalDate());
		System.out.println("年の差分は" + period.getYears() + "年");
		System.out.println("月の差分は" + period.getMonths() + "月");
		System.out.println("日の差分は" + period.getDays() + "日");

		
		
		// ≪時刻の差分の取得≫

		// Duration.between(取得した日時, 取得した日時);

		//		      toHours	時間の差分を求める
		//		      toMinutes	分の差分を求める
		//		      toSeconds	秒の差分を求める

		//時分秒の差分を求める
		Duration duration = Duration.between(dateTime8, dateTime9);
		System.out.println("時間の差分は：" + duration.toHours() + "時間");
		System.out.println("分の差分は：" + duration.toMinutes() + "分");
		System.out.println("秒の差分は：" + duration.toSeconds() + "秒");

	}

}
