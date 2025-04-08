package Practice;

import java.util.Scanner;

public class JyankenExec {

	public static void main(String[] args) {
		
		Jyanken battle = new Jyanken();
		
		Scanner choice = new Scanner(System.in);
		
		battle.playGame(choice);
		

	}

}
