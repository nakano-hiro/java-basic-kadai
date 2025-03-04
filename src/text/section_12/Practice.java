package text.section_12;

public class Practice {

	public static void main(String[] args) {
		
		boolean[] primeNum = new boolean[101];
		
		for(int i = 0; i < primeNum.length; i++ ) {
			primeNum[i] = true;
		}
		
		int divide = 2;
		while (divide < primeNum.length) {
			for (int i = divide + 1; i < primeNum.length; i++ ) {
				if (i % divide == 0) {
					primeNum[i] = false;
					continue;
				}
			}
            divide++;
		}
		
		for (int i = 2; i < primeNum.length; i++) {
			if (primeNum[i]) {
				System.out.println(i);
			}
		}
	}

}
