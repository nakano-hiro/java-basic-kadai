package text.section_08;

public class Practis {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 10);

		System.out.println(num);

		if ((num % 2 == 0)) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}

		int age = 8;

		if ((0 <= age) && (age <= 12)) {
			System.out.println("子供です");
		} else if ((13 <= age) && (age <= 19)) {
			System.out.println("ティーンエイジャーです");
		} else if ((20 <= age) && (age <= 64)) {
			System.out.println("大人です");
		} else {
			System.out.println("高齢者です");
		}

		int num2 = 5;

		if (num2 == 0) {
			System.out.println("ゼロです");
		} else if (0 < num2) {
			System.out.println("正の数です");
		} else {
			System.out.println("負の数です");
		}
		
		if((num<age)||(age<num2)) {
			
		}

	}

}
