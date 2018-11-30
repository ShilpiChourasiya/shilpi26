package interview;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number __");
		int i=sc.nextInt();
		//isPrime(i);

	}

	private static void isPrime(int i) {
		for(int a=2;a<i;a++){
			int j=i%a;
			if(j!=0){
				System.out.println("The number is a prime number");
				break;
			}
			else{
				System.out.println("The given number is not a prime number");
				break;
			}
		}

	}
}
