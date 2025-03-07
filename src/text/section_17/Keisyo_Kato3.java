package text.section_17;

public class Keisyo_Kato3 extends Keisyo_Human3 {
	
	public static void main(String[] arg) {
		
		// インスタンス化？
		Keisyo_Kato3 kato = new Keisyo_Kato3();
		kato.method1();
	}
	
	// 抽象メソッドに具体的な処理を記述
	void method1() {
		System.out.println("katomethod");
	}

}
