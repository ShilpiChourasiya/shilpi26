package interview;

public class PalindromeString {

	public static void main(String args[]){
		String s="mam";
		int k=0;
		int loop=0;
		String[] c=s.split("");
		System.out.println(c.length-1);
		for(int i=c.length-1,j=0;i>=0||j<=c.length-1;i--,j++){
			if(c[i].toString().equals(c[j].toString())){
				k++;				
			}
			loop++;
			}
		System.out.println("loop count -->> " +loop);
		System.out.println(k);
		System.out.println(c.length);
		if(k==c.length-1){
			System.out.println("The String is palindrome ");
		}	
		else{
			System.out.println("Not a Palindrome");
			
		}

	}	
}	


