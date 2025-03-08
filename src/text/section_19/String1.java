package text.section_19;

public class String1 {

	public static void main(String[] args) {

		// 文字列を扱うクラスについて

		// equals	    文字列が等しいか判定した結果を返す
		// 文字列.equals(比較する文字列)
		// true か falseで返る

		String moji1 = "テスト";
		String moji2 = "テスト";
		String moji3 = "サンプル";

		// moji1とmoji2の比較
		System.out.println(moji1.equals(moji2));
		// moji1とmoji3の比較
		System.out.println(moji1.equals(moji3));

		// compareTo	文字列を比較して等しいか、大きいか、小さいか判定した結果を返す
		// 文字列.compareTo(比較する文字列)

		// 等しい                   0
		// 文字列 > 比較する文字列  正の値
		// 文字列 < 比較する文字列  負の値

		String moji4 = "かきく";
		String moji5 = "かきく";
		String moji6 = "あいう";
		String moji7 = "さしす";

		Integer val1 = 5;
		Integer val2 = 5;
		Integer val3 = 3;
		Integer val4 = 7;

		String moji8 = "あああああ";
		String moji9 = "あああ";
		String moji10 = "いいい";
		String moji11 = "いいいい";

		//文字列を比較する場合
		System.out.println("文字列を比較する場合");
		System.out.println(moji4.compareTo(moji5));
		System.out.println(moji4.compareTo(moji6));
		System.out.println(moji4.compareTo(moji7));

		//数値を比較する場合
		System.out.println("数値を比較する場合");
		System.out.println(val1.compareTo(val2));
		System.out.println(val1.compareTo(val3));
		System.out.println(val1.compareTo(val4));

		//文字数が異なる場合
		System.out.println("文字数が異なる場合");
		System.out.println(moji8.compareTo(moji9));
		System.out.println(moji10.compareTo(moji11));

		// length	    文字列の長さを返す
		// 文字列.length()

		System.out.println(moji8.length());

		// substring	指定した位置の文字列を切り出して返す
		// 終了位置を指定することも可能
		// 考え方は配列と一緒で、最初が0番目。

		// 文字列.substring(開始位置)
		// 文字列.substring(開始位置,終了位置)

		String moji12 = "あいうえおかきくけこ";

		System.out.println(moji12.substring(3));
		System.out.println(moji12.substring(3, 8));

		// replace	    文字列を置換し、置換後の文字列を返す
		// 文字列.replace(置換前の文字列,置換後の文字列)

		System.out.println(moji12.replace("あいう", "さしす"));
		// 空白を置換することもできる
		System.out.println(moji12.replace("", " "));

		// split	    指定した文字列で分割し、分割後の文字列を返す

		String moji13 = "あいう,かきく,さしす,たちつ";

		// 文字列.split(分割する文字列)
		//分割する文字列のみ指定する
		String[] array1 = moji13.split(",");

		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}

		// 文字列.split(分割する文字列,分割する数)
		//分割する文字列と分割する数を指定する
		String[] array2 = moji13.split(",", 3);

		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}

		// trim	        文字列の先頭と末尾の空白と水平タブや改行を削除して返す
		// 文字列.trim()

		String moji14 = "        あい  うえお  ";
		String moji25 = "\n\tかき\tくけこ\n";

		//文字列の先頭と末尾の空白を削除して出力
		System.out.println(moji14.trim());
		//文字列の先頭と末尾の水平タブと改行を削除して出力
		System.out.println(moji25.trim());

		// ≪補足≫
		//	 エスケープシーケンス	意味
		//	 \n	改行
		//	 \t	水平タブ
		//	 \b	バックスペース
		//	 \f	改ページ
		//	 \’	シングルクォーテーション
		//	 \"	ダブルクォーテーション
		      

	}

}
