package text.section_10;

public class ForSyntax_1 {

	public static void main(String[] args) {

		// 【for文 繰り返し処理】
		// 繰り返す回数が決まっている場合	
		// 例：1～10の数字を順番に表示する

		// 書き方
		// for( 初期化式; 条件式; 変化式 ) {
		// 反復処理;
		// }

		// 1.初期化式は最初の１回のみ実行。
		// それ以降は
		// 2.条件式でチェック。true↓
		// 3.反復処理実行
		// 4.変化式で初期化式を変化させ、2.に戻る。
		// 5.最終的に2.でfalseになった時点で終了。

		// 例文
		// 初期値の1に1ずつ足し、11になった時点でfalseになり終了
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}

		// ≪補足：スコープについて≫
		// for文で宣言した変数（上記だとi）を、
		// for文の中以外で使うとエラーとなる。
		// これを「スコープの範囲外」と言う。

		// for文の外でも使いたい場合は、for文より前に宣言しておくこと。
		int j;

		for (j = 1; j < 11; j++) {
			System.out.println(j);
		}
		System.out.println(j);

		// 【オプション効果 continue  break 】
		// continue:処理の出力をスキップできる
		// break:処理を中断することができる

		// 条件分岐のifと組み合わせることが多い

		for (int k = 1; k < 11; k++) {

			// continue文。出力する文の前に入れる
			if (k == 3) {
				System.out.println("次の繰り返し処理に進みます");
				continue;
			}

			// いつもの出力文
			System.out.println(k + "k");

			// break文。最後に入れる
			if (k == 5) {
				System.out.println("強制終了します");
				break;
			}
		}
	}
}
