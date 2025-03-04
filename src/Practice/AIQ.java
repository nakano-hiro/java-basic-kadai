package Practice;

public class AIQ {

	public static void main(String[] args) {

		int N = 10;
		int i = 1;
		int sum = 0;
		
		while (i <= N) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		
		
		int M = 10;
		int j = 1;
		int sum2 = 0;
		
		while ( j <= M) {
			if( j % 2 == 0) {
				sum2 += j;
			}
			j++;
		}
		System.out.println(sum2);
		
		int O = 5;
		int k = 1;
		int sum3 = 1;
		
		while(k <= O) {
			sum3 *= k;
			k++;
		}
		System.out.println(sum3);

	}

}
