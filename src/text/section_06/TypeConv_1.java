package text.section_06;

public class TypeConv_1 {

	public static void main(String[] args) {
		// 【データ型の型変換】
		// 自動と手動の2パターン。

		// 【自動変換】
		// 範囲が狭い型（一番小さいのはbyte）から広範囲の型（一番大きいのはdouble）へは自動で行われる。

		// [範囲の狭いデータ型]→[広範囲なデータ型]の自動型変換
		long valLong = 123; // int型の値をlong型に変換して代入
		float valFloat = 123; // int型の値をfloat型に変換して代入
		double valDouble = 123.4F; // float型の値をdouble型に変換して代入

		System.out.println(valLong);
		System.out.println(valFloat);
		System.out.println(valDouble);

		// 【手動変換（キャスト演算子）】
		// 基本の書き方 ⇒ (変換したいデータ型)[型変換したい変数や値]
		// キャストは値がおかしくなることがあるので注意

		// 以下おかしくなる例
		// short型の値をbyte型にキャスト
		short valShort = 32767;
		byte valByte = (byte) valShort; // byte型に収まらず不整値となる
		System.out.println(valByte);

		// double型の値をint型にキャスト
		double valDouble2 = 123.456;
		int valInt = (int) valDouble2; // 小数部分はカットされる
		System.out.println(valInt);

		// ※キャスト演算子が役に立つ場面
		// 1.小数点以下まで正確に計算したいとき

		int distance = 120; // 距離(m)
		int time = 25; // 時間(秒)
		// 距離と時間から速度(m/秒)を計算
		float speed = (float) distance / (float) time;
		System.out.println(speed + "m/秒");
		// この例では、そもそも距離と時間がfroat型なら変換はいらない。

		// 2.小数点以下を切り捨てたいとき
		// 税込み価格を計算
		int price = 298; // 価格(円)
		double tax = 0.1; // 消費税(%)

		int charge = (int) (price + (price * tax));
		System.out.println("税込:" + charge + "円");

	}

}
