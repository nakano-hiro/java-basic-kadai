package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AIQ {

	public static void main(String[] args) {
		
		// 配列とarrayListの違い
		int[] num = {1,2,3};
		

		List<Integer> arr = new ArrayList<Integer>();

		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		arr.add(9);
		arr.add(10);
		
		System.out.println(arr);
		System.out.println(arr.get(4));
		
		arr.remove(4);
		
		System.out.println(arr);
		
		Collections.reverse(arr);
		System.out.println(arr);
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("文字列を入力してください");
		String input = scan.next();
		
		Set<String> word = new HashSet<>();
		
		word.add(input);
		
		System.out.println(word);
		
		scan.close();
		
		
		
		Map<String,Integer> studentMap = new HashMap<>();
		
		studentMap.put("たろう",80);
		studentMap.put("じろう",75);
		studentMap.put("さぶろう", 43);
		
		System.out.println(studentMap.get("たろう"));
		System.out.println(studentMap);
		
		
	}

}