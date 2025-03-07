package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

	// 名を表すフィールドの値をセット
	public void setGivenName() {
		givenName = "一郎";
	}

	// 抽象メソッド実装
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}
