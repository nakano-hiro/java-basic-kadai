package text.section_23;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {

		// 標準入力を扱うクラス
		// Javaで入力処理を行うクラスです。
		// 入力処理は、キーボードから入力を行う場合や、ファイルから入力を行う場合などに使います

		//		next	区切り文字までの入力を取得する(デフォルトの区切り文字は空白)

		// 入力文字の途中に空白を入れると、空白を入れる前までが出力される

		System.out.println("入力しましょう:next:空白までの文字を取得。空白を含めてみよう");

		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);

		//入力した内容を取得する
		String input = scanner.next();

		//入力した内容を出力する
		System.out.println(input);

		//			nextLine	改行までの入力を取得する
		System.out.println("入力しましょう:nextLine:改行までの文字を取得");
		//Scannerクラスのオブジェクトを生成する
		Scanner scanner2 = new Scanner(System.in);

		//入力した内容を取得する
		String input2 = scanner2.nextLine();

		//入力した内容を出力する
		System.out.println(input2);

		//			nextInt	整数の入力を取得する

		System.out.println("整数を入力しましょう:nextInt");

		//Scannerクラスのオブジェクトを生成する
		Scanner scanner3 = new Scanner(System.in);

		//入力した内容を取得する
		int input3 = scanner3.nextInt();

		//入力した内容を出力する
		System.out.println("入力した整数は" + input3);

		//			nextDouble	小数点を含む数値の入力を取得する

		System.out.println("小数点を含んだ数値を入力しましょう:nextDouble");

		//Scannerクラスのオブジェクトを生成する
		Scanner scanner4 = new Scanner(System.in);

		//入力した内容を取得する
		double input4 = scanner4.nextDouble();

		//入力した内容を出力する
		System.out.println("入力した小数点を含んだ数値は" + input4);

		//			nextBoolean	真偽値の入力を取得する

		System.out.println("真偽値を入力しましょう:nextboolean:true か falseのみ");

		//Scannerクラスのオブジェクトを生成する
		Scanner scanner5 = new Scanner(System.in);

		//入力した内容を取得する
		boolean input5 = scanner5.nextBoolean();

		//入力した内容を出力する
		System.out.println("入力した真偽値は" + input5);

		//			useDelimiter	区切り文字を指定する

		System.out.println("入力しましょう:useDelimiter:区切り文字の指定。ここでは , ");

		//Scannerクラスのオブジェクトを生成する
		Scanner scanner6 = new Scanner(System.in);

		//「,(カンマ)」を区切り文字として指定する
		scanner6.useDelimiter(",");

		//入力した内容を取得する
		String input6 = scanner6.next();

		//入力した内容を出力する
		System.out.println(input6);
		
		
		 //Scannerクラスのオブジェクトをクローズする
	      scanner.close();
	      scanner2.close();
	      scanner3.close();
	      scanner4.close();
	      scanner5.close();
	      scanner6.close();
	      

	}

}
