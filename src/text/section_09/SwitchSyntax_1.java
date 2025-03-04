package text.section_09;

public class SwitchSyntax_1 {

	public static void main(String[] args) {
		// 【Switch文】
		// 1つの変数を元に条件分岐させる構文。

		// 書き方
		//		switch(変数名) {
		//	    case 値1  -> 変数が値1に等しいときの処理;
		//	    case 値2  -> 変数が値2に等しいときの処理;
		//	    ・・・
		//	    ・・・
		//	    default -> 変数がどの値とも一致しないときの処理;

		// 【ifとswitchの違い】
		// if    ⇒2つずつ枝分かれしていく
		// switch⇒1つから多数に枝分かれしている

		// ≪if文の場合≫

		// 0～9のいずれかをランダムに生成
		int randNum = (int) (Math.random() * 10);

		// 乱数randNumの値を出力
		System.out.println(randNum);

		// 当たりはずれの判定
		if (randNum == 9) {
			System.out.println("大当たりです");
		} else if (randNum == 8) {
			System.out.println("当たりです");
		} else {
			System.out.println("はずれです");
		}

		// ≪Switch文の場合≫

		// 当たりはずれの判定
		switch (randNum) {
		case 9 -> System.out.println("大当たりです");
		case 8 -> System.out.println("当たりです");
		default -> System.out.println("はずれです");
		}
		// caseの値をカンマで区切り複数指定することもできる
		switch (randNum) {
		case 0, 2, 4, 6, 8 -> System.out.println("偶数です");
		default -> System.out.println("奇数です");
		}
		// 1つの条件で複数の処理を行う場合は以下の書き方をする

		//	case 値 -> {
		//	    処理1;
		//	    処理2;
		//	}

		switch (randNum) {
		case 8, 9 -> {
			System.out.println("大当たり");
			System.out.println("ラッキー！");
		}
		case 5, 6, 7 -> System.out.println("当たり");
		default -> System.out.println("はずれ");
		}

		// 【switch式】
		// switch文で導き出した値を、変数に代入できるもの
		// 書き方↓

		// 変数名1 = switch(変数名2) {
		//   case 値1  -> 変数2が値1に等しいときに返す値;
		//	 case 値2  -> 変数2が値2に等しいときに返す値;
		//	 ・・
		//	 default   -> 変数2がどの値とも一致しないときに返す値;
		//	};

		//※記載方法の違いの注意※
		// 「=」の左辺に代入したい変数名が必要（値を何らかの変数に代入するため）
		// 各case句の中身は、「処理」ではなく「値」
		// 中括弧の最後にはセミコロン（;）が必要

		int ranking = 1; // 順位
		String award = ""; //商品名

		award = switch (ranking) {
		case 1 -> "金メダル";
		case 2 -> "銀メダル";
		case 3 -> "銅メダル";
		default -> "参加賞";
		};
		// 商品名の表示
		System.out.println(award);

	}

}
