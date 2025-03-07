package text.section_18;

import java.util.ArrayList;

public class Collection_1 {

	public static void main(String[] args) {
		
		
		// ArayList
		// 要素が順序付けで保存される。
		// 予め要素数が決まっているものは配列でいいが、
		// 決まっていないものに関してはコレクションで管理するといい。
		
		// ArrayList<リストの型> 変数 = new ArrayList<リストの型>();
		ArrayList<String> humanList = new ArrayList<String>();
		
		// 上記で宣言した変数humanListに追加している。
		// ArrayListの変数.add("Test");
		humanList.add("kato");
		humanList.add("Tanaka");
		humanList.add("Yamada");
		
		
		// 要素の削除
		// ArrayListの変数.remove(削除する要素の番号)
		humanList.remove(0);
		
				
		// ArrayListの要素を取得するには、getメソッドを使う
		// System.out.println(変数.get(0));
		for(int i = 0; i < humanList.size(); i++) {
			System.out.println(humanList.get(i));
		}
		

	}

}
