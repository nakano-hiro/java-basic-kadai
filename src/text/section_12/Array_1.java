package text.section_12;

public class Array_1 {

	public static void main(String[] args) {

		// 【配列】
		// 1つの変数に複数の値を持たせること

		// 記述例
		// int[] scoreArray = { 70, 85, 80, 95, 90 };

		// 代入した値のことを要素と呼ぶ
		// 要素の番号を左から0番目として数えるが、これをインデックスと呼ぶ。上記の場合、80のインデックスは2

		// 基本は変数と同じ。
		// 1.宣言
		// 2.代入
		// 3.参照

		// ≪配列の宣言≫

		// データ型[] 配列名 = new データ型[要素数]; どちらでもいいが、こちらを推奨
		// データ型 配列名[] = new データ型[要素数];

		int[] scoreArray = new int[5];

		// データ型	        初期値
		// 整数型	        0
		// 浮動小数点数型	0.0（実質0）
		// 論理型	        false
		// 文字列型	        null（データが入っていない状態）

		// ≪配列の代入・初期化≫

		// 配列名[インデックス] = 値;

		scoreArray[2] = 80;

		// 初期化とは・・・値の初期値を代入すること

		// つまるところ、宣言と代入を最初に同時に行っていること。
		// これなら要素数は代入する数で決まるため、new演算子を使わなくてよい

		// n個の要素を持つ配列の初期化
		// データ型[] 配列名 = { 要素1の値, 要素2の値, 要素3の値,・・・, 要素nの値 };

		int[] scoreArrray = { 70, 85, 80, 95, 90 };

		// ≪配列の参照≫

		// 配列名[インデックス]

		System.out.println(scoreArray[2]);

		// ≪試算≫
	
		// new演算子を使いセクション別に作成
		String[] nameArray = new String[5];

		nameArray[0] = "太郎";
		nameArray[1] = "次郎";
		nameArray[2] = "三郎";
		nameArray[3] = "四郎";
		nameArray[4] = "五郎";
		
		// 初期化にて配列を作成
		int[] scoreArray2 = { 70, 85, 80, 95, 90 };
		
		
	    // 氏名を出力
        System.out.println(nameArray[0]);
        System.out.println(nameArray[1]);
        System.out.println(nameArray[2]);
        System.out.println(nameArray[3]);
        System.out.println(nameArray[4]);

        // 点数を出力
        System.out.println(scoreArray2[0]);
        System.out.println(scoreArray2[1]);
        System.out.println(scoreArray2[2]);
        System.out.println(scoreArray2[3]);
        System.out.println(scoreArray2[4]);
		
        
        
        
        // 【for文を組み合わせる】
        
        int[] scoreArray3 = {70,80,90,100};
        
        for (int i = 0; i <scoreArray3.length; i++) {
        	System.out.println((i + 1)+ "番目は" + scoreArray3[i]);
        }
		System.out.println("要素数は"+ scoreArray3.length);
		
		// ≪拡張for文≫
		// for( データ型 ループ用変数名 : 配列名 ) {
		//     反復処理;
		// }
		
		for (int score : scoreArray3) {
			System.out.println(score);
		}
		
		// 要素外参照を防げる
		// 無限ループを防げる
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
