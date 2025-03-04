package text.section_08;

public class IfSyntax_1 {

	public static void main(String[] args) {

		// 【条件分岐 if 】

		// 基本の書き方

		// if( 条件式 ) {
		//      条件式がtrue（真）のときの処理
		// } else {
		//      条件式がfalse（偽）のときの処理
		// }

		// 条件が複数ある場合（詳しくは80行目～）（追加したい処理があれば else if を使う）

		// if( 条件式A ) {
		//      条件式Aがtrue（真）のときの処理
		// } else if( 条件式B ) {
		//      条件式Aはfalse（偽）だが、条件式Bはtrue（真）のときの処理
		// } else {
		//		条件式Aも条件式Bもfalse（偽）のときの処理
		// }

		int age = 17; // 年齢

		// 【条件式】年齢が18未満か
		if (age < 18) {
			// 年齢が18未満の場合
			System.out.println("未成年です");
		} else {
			System.out.println("成人です");
		}

		// 【比較演算子】
		// 比較演算子	処理の内容
		//    ==	    2つの値が等しい場合はtrueを返す（等価演算子）。
		//    !=	    2つの値が等しくない場合はtrueを返す。
		//    >	        左辺の値が右辺の値よりも大きい場合はtrueを返す。
		//    >=	    左辺の値が右辺の値以上の場合はtrueを返す。
		//    <	        左辺の値が右辺の値よりも小さい場合はtrueを返す。
		//    <=	    左辺の値が右辺の値以下の場合はtrueを返す。

		System.out.println(1 != 2);
		System.out.println(1 == 2);

		// ≪補足１≫
		// 論理型データは比較演算子なしで条件式として使える
		// 条件式の先頭に「!」をつけると条件を反転できる

		boolean isAdult = true; // (true : 成人  false : 未成年)

		if (!isAdult) {
			System.out.println("成人です"); // trueのとき
		} else {
			System.out.println("未成年です"); // falseのとき
		}

		// ≪補足２≫
		// 浮動小数点型のデータは誤差があるので比較ができない。
		// やり方としては以下３つ

		// ・比較する2データの差を取り、誤差が許容範囲であることを確認する
		// ・2データを整数型に変換してから比較する（小数部分が無視できる場合）
		// ・数値を文字列のように扱える「BigDecimalクラス」を使用する

		float valFloat = 12.3F;
		double valDouble = 12.3;
		System.out.println(valFloat == valDouble); // 誤差があるのでfalse

		// 0.0001までの誤差は許容範囲とみなし、等しいと判定する

		if (Math.abs(valFloat - valDouble) <= 0.0001) {
			System.out.println("2つの変数値は正しいです（許容範囲）");
		} else {
			System.out.println("2つの変数値は等しくありません");
		}

		// 記述テスト
		// 0～9のいずれかをランダム生成（乱数を10倍して小数部分を切り捨て
		int randNum = (int) (Math.random() * 10);
		// 乱数の結果を出力
		System.out.println(randNum);

		// 当たり判定
		if (randNum == 9) {
			System.out.println("大当たり");
		} else if (randNum == 5) {
			System.out.println("当たり");
		} else {
			System.out.println("はずれ");
		}

		// 【論理演算子】(かつ、または)
		// 論理演算子	処理の内容
		//   &&	        条件式2つがともに成り立てばtrueを返す（AかつB）。
		//   ||	        条件式2つの片方でも成り立てばtrueを返す（AまたはB）。

		if ((7 < randNum) && (randNum <= 9)) {
			System.out.println("大当たりです");
		} else if ((4 < randNum) && (randNum <= 7)) {
			System.out.println("当たりです");
		} else {
			System.out.println("はずれです");
		}
		
		if((randNum ==1)||(randNum==3)||(randNum==5)||(randNum==7)||(randNum==9)) {
			System.out.println("奇数");
		}else {
			System.out.println("偶数");
		}

	}

}
