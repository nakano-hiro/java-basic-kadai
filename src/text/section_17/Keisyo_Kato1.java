package text.section_17;

// 継承先の子クラス

public class Keisyo_Kato1 extends Keisyo_Human1 {
	
	
	// オーバーライドにて、
	// 引数名と処理内容だけ変更している。
	public void output(int katoage, double katoweight) {
		System.out.println("年齢：" + katoage);
		System.out.println("体重" + katoweight);
	}
	
}
