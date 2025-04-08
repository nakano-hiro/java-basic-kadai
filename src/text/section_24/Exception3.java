package text.section_24;

public class Exception3 {

	public static void main(String[] args) {
		
//		throw	意図的に例外を発生させる

		//体重を表す変数
		double weight = -10.0;
		if (weight < 0) {
			throw new IllegalArgumentException("体重は入力された" + weight + "のようにマイナスの値になりません");
		}
	}

}
