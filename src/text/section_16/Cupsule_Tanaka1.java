package text.section_16;

// 【アクセス修飾子について】
// private	                             自分のクラスからのみアクセスできる
// アクセス修飾子なし（package private） 自分のクラスと同じパッケージからアクセスできる
// protected	                         継承した子クラス及び自分と同じパッケージからアクセスできる
// public	                             自分のクラス以外からもアクセスできる

public class Cupsule_Tanaka1 {
	
	// private
	private int id = 5;
	private int id2 =6;
	private int id3 =7;
	
	// コンストラクタ
	// アクセス修飾子なし
	Cupsule_Tanaka1(){
	}
	// public アウトプットするだけのメソッド
	public void output() {
		System.out.println("idは "+ this.id);
	}
	
    // ゲッター
    // privateで設定したフィールドの値を取得できるように、
	// publicで値を返すようにしている手法のこと。
    public int getId() {
    	return this.id2;
    }
    
    
    // セッター
    // 編集が行える。取得することはできないため、
    // ゲッターとセット。
    
    public int getId3() {
    	return this.id3;
    }
    public void setId(int id3) {
    	this.id3 = id3;
    }

}

