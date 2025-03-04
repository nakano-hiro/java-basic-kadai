// 【データ型について】

// 基本的に４種類
// ・整数型
// ・不動小数点型
// ・論理型
// ・文字列型

package text.section_04;

public class Data_1 {

	public static void main(String[] args) {

		// 【整数型】

		//	データ型	値の範囲	                                            サイズ
		//	byte	    -128～127	                                            8ビット
		//	short	    -32,768～32,767 	                                    16ビット
		//	int	        -2,147,483,648～2,147,483,647	                        32ビット
		//	long	    -9,223,372,036,854,775,808～9,223,372,036,854,775,807	64ビット

		//	上記のように、データ型により扱える範囲が決まっている。
		//	基本的にはintで設定されているが、
		//	実際の開発では取りうる値がすべて収まる範囲でできる限り小さいデータ型を選ぶ。

		System.out.println(100);
		System.out.println(0);
		System.out.println(-123);

		//		以下の場合はintの最大値2147483647を超えているのでエラーが出るが、
		//		末尾に「L」上記の表でいうlongの値を含めることで表示可能になる。
		System.out.println(2147483648L);

		// 【浮動小数点型】

		//  データ型	値の範囲	                                                        サイズ
		//  float	(-3.4028235 × 10の38乗)　～(3.4028235 × 10の38乗)	                    32ビット
		//  double	(-1.7976931348623157 × 10の308乗)　～(1.7976931348623157 × 10の308乗)	64ビット

		// こちらも範囲が決まっているが、
		// 基本はdoubleなので困ることはないはず。

		System.out.println(0.1);
		System.out.println(1.618);
		System.out.println(-9876.0123);

		// 【論理型】

		//  データ型	値の範囲	        サイズ
		//  boolean	    true または false	1バイト※環境による

		System.out.println(true);
		System.out.println(false);

		// 【文字列型】

		//  1文字だけの場合は'で囲む。

		System.out.println("こんにちは");
		System.out.println('a');

		// 【四則演算】

		System.out.println(20 + 14);
		System.out.println(1.5 - 0.6);
		System.out.println(30 * 3 / 2);
		System.out.println(10 % 3);

		// 【文字列の連結】
		// 文字列と数値の場合、文字列が先なら数値も文字列扱いとなる
		
		System.out.println("侍" + "テラコヤ");
		System.out.println(123+(456+"テラコヤ"));
		

	}

}
