package text.section_13;

public class Method_1 {

	public static void main(String[] args) {

		// 【メソッド】
		// 一連の処理をまとめたもの。
		// 冒頭にあるpublic...がそれ。

		// プログラミングの効率をアップできる
		// ソースコードが読みやすくなる
		// 処理の変更が必要になっても変更量が少ない

		// 【構成】          冒頭の例だと
		//	本章（1）修飾子	     public static   メソッドにさまざまな性質を与えるキーワード。複数指定も可能。mainメソッドには 「public」 と 「static」 を付ける。
		//	14章（2）戻り値の型	 void            戻り値を返すときのデータ型。mainメソッドは必ず 「void」。戻り値とは、メソッドの実行結果をデータで返す仕組みのこと。
		//	    （3）メソッド名	 main            メソッドにつける名前。mainメソッドは必ず 「main」。メソッドの命名規則（名前のつけ方）は、変数名とおよそ同様。
		//	14章（4）引数の宣言	 (String[] args) 引数が必要な場合、ここで宣言する。引数とは、メソッドの実行時にデータを渡す仕組みのこと。
		//	    （5）処理内容	 {以降           メソッドが呼び出されたときに実行する一連の処理。

		// ≪修飾子≫
		// まずはアクセス修飾子とatatic修飾子を覚える。

		// public	    アクセス修飾子の1つ。publicを付けたメソッドは、どのクラスからでも呼び出せる。
		// private	    アクセス修飾子の1つ。privateを付けたメソッドは、同じクラス内からしか呼び出せない。
		// protected	アクセス修飾子の1つ。protectedを付けたメソッドは、同じファイル内または親子関係のあるクラスからしか呼び出せない。
		// static	    staticを付けたメソッドは、クラスの実体を作らずに呼び出せる（後述）。

		int greeting = 123;

		greeting();

		System.out.println(greeting);

		greeting();
	}

	public static void greeting() {
		System.out.println("おはようございます！");
		System.out.println("昨日はよく眠れましたか？");
		System.out.println("今日も一日頑張りましょう！");
	}

}
