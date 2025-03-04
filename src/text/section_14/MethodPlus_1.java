package text.section_14;

public class MethodPlus_1 {

	public static void main(String[] args) {

		// 【引数（ひきすう）】
		// メソッドに与えるデータのこと。

		// 例）購入金額に送料を加算するメソッド
		// x円(決まっていない値[引数])
		// + 500円
		// x + 500円(戻り値)

		final int postage1 = 500;
		final int postage2 = 800;
		// 1000円を送料込み金額で表示
		addPostage(1000, postage1);

		addPostage(1200, postage2);
		
		// オーバーロードの出力テスト
		// 同じ引数名なのに出力結果が異なる
		test(123); // test(1)を呼び出す
		test(1.23F); // test(2)を呼び出す
		test(123, 1.23F); // test(3)を呼び出す
		test(1.23F, 123); // test(4)を呼び出す

	}

	public static void addPostage(final int price, final int postage) {// 引数は複数設定可能

		int total = price + postage; // 価格に送料を加算
		System.out.println("送料込みの金額は" + total + " 円");
	}

	// 【メソッドのオーバーロード】
	// 引数が異なる同名メソッドを定義することをオーバーロードという

	// 「異なる」とは以下の3パターン
	// ・引数のデータ型が異なる
	// ・引数の個数が異なる
	// ・引数の順番が異なる

	// printlnもメソッドで、様々な値を出力できるメソッド。
	// オーバーロードすると、メソッドを使う人が引数に渡すデータ型を意識せずに済む

	// test(1)
	public static void test(int i) {
		System.out.println("(1)int型：" + i);
	}
	// test(2)
	public static void test(float f) {
		System.out.println("(2)float型：" + f);
	}
	// test(3)
	public static void test(int i, float f) {
		System.out.println("(3)int型：" + i + "／float型：" + f);
	}
	// test(4)
	public static void test(float f, int i) {
		System.out.println("(4)float型：" + f + "／int型：" + i);
	}

}
