package text.section_24;

import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		
		//		try-with-resource	例外の有無に関わらずリソースを自動的にクローズする
//		try(リソースとなるオブジェクトの生成){
//			   リソースとなるオブジェクトによる処理
//			}
//		
		
		System.out.println("入力しましょう");

		String input2 = null;

		//Scannerクラスのオブジェクトを生成する
		try (Scanner scanner2 = new Scanner(System.in)) {
			//入力した内容を取得する
			input2 = scanner2.next();
		};
		//入力した内容を出力する
		System.out.println("入力した内容は" + input2);

		
	}
}
