package Practice;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken {

	// 自分の手を選ぶ
	public String getMyChoice(Scanner choice) {

		while (true) {

			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");

			String input = choice.next();

			if (input.equals("r") || input.equals("s") || input.equals("p")) {
				
				return input;
				
			} else {
				System.out.println("入力文字が正しくありません。");
			}
		}
	}
		public String getRandom() {
			
			String[] rival = {"r","s","p"};
			
			int rivalChoice = (int) Math.floor(Math.random()*3);
		
			return rival[rivalChoice];
			
		}
		
		public void playGame(Scanner choice) {
			
			HashMap<String,String> handMap = new HashMap<>();
			
			handMap.put("r","グー");
			handMap.put("s","チョキ");
			handMap.put("p","パー");
			
			
			String you = getMyChoice(choice);
			String rival = getRandom();
			
		     System.out.println("あなたは"+handMap.get(you));
		     System.out.println("あいては"+handMap.get(rival));
			
			
			if(you.equals(rival)) {
				System.out.println("あいこです");
			}else if(you.equals("r") && rival.equals("s") ||
					 you.equals("s") && rival.equals("p") ||
					 you.equals("p") && rival.equals("r")) {
				System.out.println("自分の勝ちです");
				}else {
					System.out.println("自分の負けです");
					
				}
	
		}

}
