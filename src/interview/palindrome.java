package interview;

import java.util.Scanner;

public class palindrome {

	public static void main(String args[]){
		int sum = 0,n=0,r=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number -->> ");
		n=sc.nextInt();
		
		System.out.println("Number Enter by you is -->> " +n);
	 
		while(n>0){    
			r=n%10;  //getting remainder  
			sum=(sum*10)+r;    
			n=n/10;    
		}    
		System.out.println("Printing value of sum " +sum);
		
		if(n==sum)  
		{
			System.out.println("palindrome number ");
		}
		else    
			System.out.println("not palindrome");    
	}  

}
