package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		Dictionary_Chapter21 fruitDictionary = new Dictionary_Chapter21();
		
		String[] wordSearch = {"apple", "banana", "grape", "orange"};

		fruitDictionary.addFruits();
		
		for (String word : wordSearch){
			fruitDictionary.search(word);
		}

	}

}
