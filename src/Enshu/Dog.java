package Enshu;

public class Dog {
	
	// フィールドの宣言。最初にアクセス修飾子がつく以外、変数の宣言と同じ
	public String name;
	
	public static int number;
	
	// メソッド
	public void run() {
		System.out.println("走る");
	}

	public static void showNumber() {
		System.out.println(number);
	}
}
