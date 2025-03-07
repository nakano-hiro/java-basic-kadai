package text.section_17;

// 継承元の親クラス

public class Keisyo_Human1 {
	
	double weight;
	double height;
	
	double calcBmi(double weight,double height) {
		return this.weight / (this.height * this.height);
	}
	
	
	// オーバーライド
	// 親クラスの値を編集することができる。
	// 引数名と処理内容だけ変更することができる。
	// 変更内容はKeisyo_Kato1にて記述。
	int age;
	double weight2;
	
	public void output(int paraage,double paraweight) {
		System.out.println(paraage);
		System.out.println(paraweight);
	}

}
