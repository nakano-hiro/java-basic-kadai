package text.section_16;

public class Cupsule_Test1 {

	public static void main(String[] args) {
		
		// インスタンス化
		Cupsule_Tanaka1 tanaka = new Cupsule_Tanaka1();
		
		tanaka.output();
		
        // 以下のように、直接idフィールドを読みに行こうとするとエラーになる
        // System.out.println(tanaka.id);
		
		
		
        // 以下はゲッターによって返された戻り値をこのクラスで取得し、出力している
		
		int id2 =tanaka.getId();
		System.out.println(id2);
		
        // 以下上段のように、直接はアクセスできない。
        // ダメな例：System.out.println(tanaka.id2);
		
		
		
		// 以下はセッターによって編集可能になっている。
		// セッターは編集のみなので、ゲッターとセットで使われる。
		tanaka.setId(9);
		int id3 = tanaka.getId3();
		System.out.println(id3);
		
	}

}
