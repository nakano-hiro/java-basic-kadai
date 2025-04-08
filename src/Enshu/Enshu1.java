package Enshu;

public class Enshu1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "×" + j + "=" + (i * j));
			}
		}
		
		
		
		System.out.println(cal(8177,3315));
		
		

	}
	
	// ユークリッドの互除法
	static int cal(int a,int b) {
		
		int r = a % b;
		
		while(r != 0) {
			
			a = b;
			b = r;
			r = a % b;
			
		}
		return b;
		
	}
	
	

}
