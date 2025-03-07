package text.section_17;

public class Keisyo_Kato2 extends Keisyo_Human2 {
	
	
	// superを使うことで、親クラスのフィールドやメソッドにアクセス可能。
	// 子クラスのコンストラクタから呼び出せる。
	
	// 子クラスのコンストラクタ
	Keisyo_Kato2(){
		
        // super(引数)で呼び出し
		super("kato2");
		System.out.println(super.weight3);
	}

}
