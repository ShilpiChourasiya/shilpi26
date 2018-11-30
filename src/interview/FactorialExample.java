package interview;

import java.util.Scanner;

public class FactorialExample {
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number... ");
		int t=sc.nextInt();
		int i, fact=1;
		for(i=1; i<= t; i++){
				fact= fact*i;
		}
		System.out.println("Factorial of number "+t+" is "+fact);
	}

}
