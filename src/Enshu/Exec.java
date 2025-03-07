package Enshu;

public class Exec {

	public static void main(String[] args) {
		
		// インスタンス化（実体化）
		Dog dog1 = new Dog();
		
		// インスタンスのフィールドの呼び出し
		dog1.name = "太郎";
		System.out.println(dog1.name);
		
		// インスタンスのメソッドの呼び出し
		dog1.run();
		
		
		
		// staticで定義されたものはインスタンス化しなくても使える
		Dog.showNumber();
		


	}

}
