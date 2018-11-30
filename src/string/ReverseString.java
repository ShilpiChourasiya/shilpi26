package string;

import java.util.Scanner;

public class ReverseString {
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String.....");
		String s= sc.next();
		int i= s.length();
		for(int j=i-1; j>=0;j--){
			
		System.out.print(s.charAt(j));
	}
	}
}
