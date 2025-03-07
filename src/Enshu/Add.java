package Enshu;

public class Add {

	public static void main(String[] args) {

		add2(-100, 200);

	}

	public static String add(int a, int b) {

		if (a <= 0) {
			return "不正です";
		} else if (b <= 0) {
			return "不正です";
		}

		int sum = a + b;

		if (sum >= 200) {
			return "合格";
		} else {
			return "不合格";
		}
	}

	public static void add2(int a, int b) {
		//		アーリーリターン
		//	returnが動いた時点で処理が止まる

		if (a <= 0 || b <= 0) {
			System.out.println("不正です");
			return;
		}

		int sum = a + b;

		if (sum >= 200) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
	}
}
