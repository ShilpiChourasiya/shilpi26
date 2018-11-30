package array;

public class SumArray {
	static int mobileNum[]=new int[10];
	static int a[]=new int[2];

	{
		mobileNum[0]=8;
		mobileNum[1]=2;
		mobileNum[2]=7;
		mobileNum[3]=7;
		mobileNum[4]=2;
		mobileNum[5]=9;
		mobileNum[6]=4;
		mobileNum[7]=8;
		mobileNum[8]=2;
		mobileNum[9]=1;
	}
	public static void main(String args[]){
		SumArray sa = new SumArray();
		int b= mobileNum.length;
		System.out.println("Length of Array list is-> "+b);
		sa.sum(b);
		sa.evenNumberSum(b-1);
		System.out.println("Sum of even number in array is ->  "+a[0]);
		System.out.println("Sum of odd number in array is ->  "+a[1]);
	}
	protected void sum(int a){
		//int sizeOfArray=mobileNum.length;
		int sum = 0;
		for(int i=0;i<a;i=i+2){

			sum=sum+mobileNum[i];
		}	

		System.out.println("sum alternate number of mobileNum is  " +sum);
	}
	public int[] evenNumberSum(int c){
		int evensum=0;
		int oddSum=0;
		//int a[]=new int[2];
		
		for(int i=0; i<=c; i++){
			if(mobileNum[i]%2==0){
				evensum= evensum + mobileNum[i];
			}
			else{
				oddSum= oddSum + mobileNum[i];
				System.out.println("Sum of odd number----->  "+oddSum);
			}
		}
		//System.out.println("Sum of even number in array is ->  "+evensum);
		//System.out.println("Sum of odd number in array is ->  "+oddSum);
		a[0]=evensum;
		a[1]=oddSum;

		return a;

	}
}
