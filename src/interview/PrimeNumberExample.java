package interview;

import java.util.Scanner;

public class PrimeNumberExample {
public static void main (String... args){
	boolean isprime= true;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Your Number");
	int num = sc.nextInt();
	for(int i=2; i<num; i++){
	if(num % i==0){
		isprime=false;
		break;
	}
	}
	if(isprime){
		System.out.println(+num+" is a prime number");
	}
	else{
		System.out.println(+num+ " is not a prime number");
	}
}
}
