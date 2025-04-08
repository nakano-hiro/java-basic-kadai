package Enshu;

public class Dog {
	
	// コンストラクタ（引数なし）
	public Dog() {
	}

	
	// コンストラクタ（引数あり）
	public Dog(String name) {
		this.name = name;
	}
	
	// フィールドの宣言。最初にアクセス修飾子がつく以外、変数の宣言と同じ
	private String name;
	
	public static int number;
	
	
	
	// メソッド
	// ゲッター（フィールドを取得する）
	public String getName() {
		return this.name;
	}
	
	// セッター（フィールドに値を代入する）
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void run() {
		System.out.println("走る");
	}

	public static void showNumber() {
		System.out.println(number);
	}
	
	
}
