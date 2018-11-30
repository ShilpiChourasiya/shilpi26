package string;

import java.util.Scanner;

public class Duplicate {
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String.....");
		//String s=new String();
		String s=sc.next();
		int i= s.length();
		for(int j=0; j<=i-1;j++){
			for(int k=j+1; k<=j;k++){
				char c1=s.charAt(j);
				char c2=s.charAt(k);
				int b=Character.valueOf(c1).compareTo(Character.valueOf(c2));
				String s1 = String.valueOf(c1);
				String s2 = String.valueOf(c2);
				if(s1.equals(s2)){
					System.out.println("printing duplicate char  " +c2);
				}
								
			}
		}
	}
}