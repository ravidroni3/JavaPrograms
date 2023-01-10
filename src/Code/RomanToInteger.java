package Code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
	public static int romanToInt(String s) {
		Map<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		int n = s.length();
		int num = romanMap.get(s.charAt(n - 1));
		for (int i = n - 2; i >= 0; i--) {
			if (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) {
				num += romanMap.get(s.charAt(i));
			} else {
				num -= romanMap.get(s.charAt(i));
			}
		}
		return num;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		String name = sc.nextLine();
		int result = romanToInt(name);
		System.out.println("The Roman Number is: " + name);
		System.out.println("Its Integer Value is: " + result);

	}

}
