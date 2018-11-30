package string;

import java.util.Scanner;

//import java.util.Scanner;

public class Methods {
public static void main(String... args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your String... ");
	String s= sc.next();
	String s2= "my name is shilpi";
	/*int i= s.length();
	System.out.print("reverse of string... ");
	for(int j=i-1; j>=0;j--){
	System.out.print(s.charAt(j));
}*/
	System.out.println("  ");
	System.out.println("concat... "+s.concat(s2));//it concatenates specified string,
	System.out.println("index of... "+s.indexOf('4')); // it gives index of character,
	System.out.println("compare sto s2... "+s.compareTo(s2)); // it compares both string and returns 
	String s3="shilpi    ";
	System.out.println("does String contains... "+s3+ "--> "  +s2.contains(s3)); //the sequence of characters in this string. It returns true if sequence of char values are found in this string otherwise returns false.
	System.out.println("substring of string s2... "+s2.substring(3,7)); //We pass begin index and end index number position in the java substring method where start index is inclusive and end index is exclusive. In other words, start index starts from 0 whereas end index starts from 1.
	System.out.println("trim... "+s3.trim()+"chourasiya"); //trim() method eliminates leading and trailing spaces.

	}
}
