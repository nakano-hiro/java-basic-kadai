package text.section_17_2;


import text.section_17.Keisyo_HumanProtected;

public class Keisyo_Yamada1 extends Keisyo_HumanProtected {
	
	// 親クラスの体重フィールドはprotectedだが、
	// 継承した子クラスなのでアクセス可能の状態
	
	public static void main(String[] args) {
		System.out.println(Keisyo_HumanProtected.weight);
	}

}
