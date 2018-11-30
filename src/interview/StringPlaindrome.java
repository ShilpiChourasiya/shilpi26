package interview;

import java.util.Scanner;

public class StringPlaindrome {
public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your string....-> ");
	String s=sc.next();
	//String s= "mom";
	String s1="";
	for (int i= s.length()-1; i>=0;i--){
		s1+=s.charAt(i);
	}
	if(s1.equalsIgnoreCase(s)){
	System.out.println("is a palindrome");
	}
	else{
		System.out.println("not a palindrome");