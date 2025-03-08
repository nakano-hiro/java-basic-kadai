package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	static HashMap<String, String> fruitMap = new HashMap<String, String>();

	public void addFruits() {

		fruitMap.put("apple", "りんご");
		fruitMap.put("peach", "桃");
		fruitMap.put("banana", "バナナ");
		fruitMap.put("lemon", "レモン");
		fruitMap.put("pear", "梨");
		fruitMap.put("kiwi", "キウィ");
		fruitMap.put("strawberry", "いちご");
		fruitMap.put("grape", "ぶどう");
		fruitMap.put("muscat", "マスカット");
		fruitMap.put("cherry", "さくらんぼ");

	}

	public void search(String word) {

		boolean found = false;

		for (String key : fruitMap.keySet()) {
			if (key.equals(word)) {
				found = true;
				System.out.println(word + "の意味は" + fruitMap.get(word));
				break;
			}

		}
		if (!found) {
			System.out.println(word + "は辞書に存在しません");

		}

	}

}
