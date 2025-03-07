package text.section_18;

import java.util.HashMap;

public class Collection_2 {

	public static void main(String[] args) {
		
		
		// HashMap
		// キーと値が紐づいて要素が保持される
		
		// HashMap<キーの型,値の型> 変数 = new HashMap<キーの型,値の型>();
		HashMap<Integer,String> humanMap = new HashMap<Integer,String>();
		
		// 要素の追加。キーと値を代入している
		// HashMapの変数.put(キー,値)
		humanMap.put(1,"kato");
		humanMap.put(2,"tanaka");
		humanMap.put(3,"yamada");
		
		
		// 要素の削除。
		// HashMapの変数.remove(削除する要素のキー番号)
		humanMap.remove(1);
		
		
		// 取得方法はArrayListと同じgetを使う
		System.out.println("キーが1の人の値は " + humanMap.get(1));
		System.out.println("キーが2の人の値は " + humanMap.get(2));
		System.out.println("キーが3の人の値は " + humanMap.get(3));

	}

}
