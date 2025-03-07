package text.section_17;

public class Keisyo_Main1_2 {

	public static void main(String[] args) {
		
		// 子クラスを使い出力
		
		Keisyo_Kato1 kato = new Keisyo_Kato1();
		
		
		kato.weight = 70.0;
		kato.height = 1.6;
		
		double bmi = kato.calcBmi(kato.weight, kato.height);
		
		System.out.println(bmi);
		
		// オーバーライドにて、親クラスの出力メソッドに文章を加えた編集をしている。
		kato.age = 54;
		kato.weight2 = 60.5;
		kato.output(kato.age, kato.weight2);
		
		
		
		// 以下はHuman2とkato2ファイルを使用。
		// superにて親クラスのフィールドやコンストラクタを呼び出している。
		// コンストラクタの出力はkato2の引数を渡しているのでそれが出力されているが、
		// 体重は親クラスのものになっている。
		Keisyo_Kato2 kato2 = new Keisyo_Kato2();
		
		kato2.weight3 = 90.5;

	}

}
