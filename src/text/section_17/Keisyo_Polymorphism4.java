package text.section_17;

public class Keisyo_Polymorphism4 {

	public static void main(String[] args) {
		
		// 多態性（ポリフォーリズム）
		// 親クラスの型に子クラスのインスタンスが代入できる
		// メソッド実行時は、代入された子クラスのインスタンスのメソッドが実行される
		
		
		// Keisyo_Kato4インスタンスを親クラスのKeisyo4へ代入
		Keisyo_Human4 kato = new Keisyo_Kato4();
		
		// Keisyo_Tanaka4インスタンスを親クラスのKeisyo4へ代入
		Keisyo_Human4 tanaka = new Keisyo_Tanaka4();
		
		
		// Keisyo＿Kato　or Tanakaインスタンスのoutputメソッドを実行
		kato.output();
		tanaka.output();

	}

}
