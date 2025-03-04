package text.section_14;

public class MethodPlus_2 {

	public static void main(String[] args) {

		// 【戻り値】
		// メソッドの実行結果をデータで返す仕組み

		// データで返すためには以下の手続きが必要

		// 1.メソッドの「戻り値の型」を、返したいデータの型にする
		// ⇒今まで「void」と入れてきたところにデータ型を入れる
		// 例）public static char getGrade( final int score ) {

		// 2.メソッド内でreturn文により戻り値を返す
		// 書き方⇒  return 返したいデータ;

		// ※戻り値の型をvoid以外にした場合は、return文で戻り値を返さないとエラーになります。
		// 戻り値を返したい場合は、return文を忘れずに入れましょう。

		int[] scoreArray = { 70, 85, 80, 95, 90, 120 };
		
		// 点数ごとに成績をつける
		for (int score : scoreArray) {
			System.out.println(score+ "点だと成績は"+ getGrade(score));
		}

	}
	
	public static char getGrade(final int score) {
		
		char grade = 'C';
		
		// 点数が不正だった場合は成績を「-」としてメソッドを終了
		if ( score < 0 || 100 < score ) {
			return '-';
		}
		
		if (90 <= score) {
			grade = 'A';
		} else if (80 <= score) {
				grade = 'B';
			}
		return grade;
	}

}
