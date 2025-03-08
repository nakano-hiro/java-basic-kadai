package text.section_20;

public class Math1 {

	public static void main(String[] args) {

		// 数値を扱うクラスについて
		// Mathクラスを使う

		//		abs	引数の絶対値を返す
		// abs(絶対値を求める値)

		int val1 = 100;
		int val2 = -500;
		int val3 = 0;

		//引数の絶対値を出力する
		System.out.println(Math.abs(val1));
		System.out.println(Math.abs(val2));
		System.out.println(Math.abs(val3));
		
		
		
		

		//		max	引数で渡した値を比較して大きい方の値を返す
		// max(比較する値1,比較する値2)
		
		//引数で渡した値を比較して大きい方の値を返す
	      System.out.println(Math.max(val1,val2));
		
		
		//		min	引数で渡した値を比較して小さい方の値を返す
	      // min(比較する値1,比較する値2)
	      
	      //引数で渡した値を比較して小さい方の値を返す
	      System.out.println(Math.min(val1,val2));
	      
	      
		//		ceil	引数で渡した値を切り上げた値を返す
	      // ceil(切り上げる値)
	      
	      double val4 = 1.6;
	      double val5 = 1.4;
	      double val6 = -1.4;
	        
	      //引数で渡した値を切り上げた値を出力する
	      System.out.println(Math.ceil(val4));
	      System.out.println(Math.ceil(val5));
	      System.out.println(Math.ceil(val6));
	      
	      
		//		floor	引数で渡した値を切り下げた値を返す
	      // floor(切り下げる値)
	      
	    //引数で渡した値を切り下げた値を出力する
	      System.out.println(Math.floor(val4));
	      System.out.println(Math.floor(val5));
	      System.out.println(Math.floor(val6));
	      
		//		round	引数で渡した値を四捨五入した値を返す
	     // round(四捨五入する値)
	      
	      //引数で渡した値を四捨五入した値を出力する
	         System.out.println(Math.round(val4));
	         System.out.println(Math.round(val5));
	         System.out.println(Math.round(val6));
	      
	          
		//		pow	引数で渡した値を累乗して返す
	         // pow(累乗される値,累乗する数)
	         
	         double val7 = 2.0;
	     	double val8 = -2.0;
	     	        
	           //引数で渡した値を累乗される値を、累乗する数分累乗した値を出力する
	     	System.out.println(Math.pow(val7,2));
	           System.out.println(Math.pow(val7,3));
	           System.out.println(Math.pow(val8,2));
	           System.out.println(Math.pow(val8,3));
	         
	         
	         
		//		sqrt	引数で渡した値の平方根を返す
	           // sqrt(平方根を求める値)
	           // sqrt()メソッドに0より小さい値が渡されるとNaNが返される
	           
	           double val9 = 25;
	           double val10 = -25;
	             
	           //引数で渡した値の平方根を出力する
	           System.out.println(Math.sqrt(val9));
	           System.out.println(Math.sqrt(val10));
	           
	           
	           
	           
		//		cbrt	引数で渡した値の立方根を返す
	          // cbrt(立方根を求める値)
	           
	           double val11 = 125;
	           double val12 = -125;
	     	        
	           //引数で渡した値の立方根を出力する
	           System.out.println(Math.cbrt(val11));
	           System.out.println(Math.cbrt(val12));
	           
		//		random	乱数を返す
	           // random()
	           // Math.random()メソッドは、0以上1未満(0.999999…)の範囲で乱数を生成
	           
	           for (int i = 0 ; i < 5; i++){
	               //乱数の範囲で指定した5までの数値を出力する
	               System.out.println(Math.random() * 5);
	            }
	           
	           for (int i = 0 ; i < 5; i++){
	               //乱数の範囲で指定した5までの数値を四捨五入して出力する
	               System.out.println(Math.round(Math.random() * 5));
	            }


	}

}
