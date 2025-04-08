package Practice;

import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
//		
//		String word = x.next();
//		
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(word);
//		}
		
		int num = x.nextInt();
		
//		for(int i = 1; i <= 9; i++) {
//			System.out.println(num*i);
//		}
		
		int result = 1;
		
		for(int i = 1; i <= 8; i++) {
			result *= num;
			
			System.out.println(+result);
		}
		
		
		
		x.close();
	}

}
