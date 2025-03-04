package text.section_05;

public class Variable_1 {

	public static void main(String[] args) {

		// 【変数を使うときの基本】
		// 1.宣言（箱の用意をする）
		// 2.代入（箱にデータを入れる）
		// 3.参照（箱のデータを使う）

		// 【変数の宣言】
		// [データ型] [変数名] = [変数の初期値];

		// 整数型の変数を宣言
		byte testByte = 1;
		short testShort = 12;
		int testInt = 123;
		long testLong = 1234;

		// 浮動小数点型の変数を宣言
		float testFloat = 0.123F; // 代入する値の末尾にはFが必要。Fをつけないとdouble型扱いとなる
		double testDouble = 0.123456;

		// 論理型の変数を宣言
		boolean testBoolean = true;

		// 文字列型・文字型の変数を宣言
		String testString = "Samurai";
		char testChar = 'S';

		// 変数testの値を表示
		System.out.println(testByte);
		System.out.println(testShort);
		System.out.println(testInt);
		System.out.println(testLong);
		System.out.println(testFloat);
		System.out.println(testDouble);
		System.out.println(testBoolean);
		System.out.println(testString);
		System.out.println(testChar);

		// 【変数の代入】
		int testIntChange = 123;
		// 変数を入れ替える
		testIntChange = 456;
		System.out.println(testIntChange);

		// 【値の計算や連結】
		int num1 = 5;
		float num2 = 2.5F;
		System.out.println(num1 + num2);

		String lastName = "侍";
		String firstName = "太郎";
		System.out.println(lastName + firstName);

		// 【変数を変数へ代入する】
		int num3 = 32;
		int num4 = num3 / 4;
		System.out.println("num3は" + num3);
		System.out.println("num4は" + num4);

		// 【final変数（定数）】
		// 定数＝変更できない変数のこと。
		// 定数名は必ず大文字で、単語間は＿で表現する。
		final double PI = 3.14159;// 円周率
		double circleArea = 0, circumference = 0; // 円の面積と円周
		int radius = 5;

		// 円の面積を求める
		circleArea = PI * radius * radius;
		System.out.println(circleArea);

		// 円周を求める
		circumference = PI * (radius * 2);
		System.out.println(circumference);

	}

}
