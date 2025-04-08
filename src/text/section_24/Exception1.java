package text.section_24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {

		// 例外処理について（エラーなど）

		//		try-catch	try文で例外が起きているか確認し、例外が起きた場合catch文で処理する

		// try{
		//	 例外が起きているか確認する処理
		// }

		// catch(例外クラス 変数名){
		//	   例外が起きた場合に行う処理
		// }

		//配列の宣言
		int[] number = new int[1];

		try {
			number[0] = 1;
			number[1] = 2;
		} catch (ArrayIndexOutOfBoundsException e) {
			//配列のインデックスが範囲外の場合に行う処理
			System.out.println("配列のインデックスが範囲外です");
		}

		System.out.println("処理終了です");

		//		finally	例外の有無に関わらず実行される

		// finally{
		//	   例外が起きても、起きなくても行う処理
		//	}

		System.out.println("整数を入力しましょう");

		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);

		try {
			//入力した内容を取得する
			int input = scanner.nextInt();
			System.out.println(input);
		} catch (InputMismatchException e) {
			//整数の入力ではない場合に行う処理
			System.out.println("整数の入力ではありません");
		} finally {
			//Scannerクラスのオブジェクトをクローズする
			System.out.println("Scannerクラスのオブジェクトをクローズします");
			scanner.close();
		}

		System.out.println("処理終了です");

		// ≪複数の例外処理≫

		//		catch(例外クラス 変数名){
		//		   例外が起きた場合に行う処理
		//		}
		//		catch(例外クラス 変数名){
		//		   例外が起きた場合に行う処理
		//		}
		//		catch(例外クラス 変数名){
		//			例外が起きた場合に行う処理
		//		}
		
		int number1 = 2;
		int number2 = 0;

		try {
			//割り算の結果を取得する
			System.out.println(number1 / number2);
		} catch (IllegalStateException e) {
			//メソッドの呼び出しが不適切な場合に行う処理
			System.out.println("メソッドの呼び出しが不適切です");
		} catch (NullPointerException e) {
			//オブジェクトがnullの場合に行う処理
			System.out.println("オブジェクトがnullです");
		} catch (ArithmeticException e) {
			//不適切な計算が行われた場合に行う処理
			System.out.println("不適切な計算が行われました");
		}

		System.out.println("処理終了です");
		
		
		
		
		
		
	}

}
