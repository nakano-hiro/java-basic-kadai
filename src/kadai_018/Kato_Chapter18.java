package kadai_018;

// 親クラス
abstract public class Kato_Chapter18 {

	public String familyName = "加藤"; // 性
	public String givenName; // 名
	public String address = "東京都中野区〇×"; // 住所

	// 共通の内容を出力
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}

	// 個別の内容を出力
	abstract public void eachIntroduce();

	// 紹介の実行
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	}

}
