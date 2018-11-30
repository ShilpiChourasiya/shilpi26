package array;

public class Multiplication {
	public static void main(String args[]){
		int mobileNum[]=new int[10];
		mobileNum[0]=8;
		mobileNum[1]=2;
		mobileNum[2]=7;
		mobileNum[3]=7;
		mobileNum[4]=2;
		mobileNum[5]=9;
		mobileNum[6]=4;
		mobileNum[7]=8;
		mobileNum[8]=7;
		mobileNum[9]=1;

		int sizeOfArray=mobileNum.length;
		int multiple = 1;
		for(int i=0;i<sizeOfArray;i++){
			multiple=multiple*mobileNum[i];
			}	
			System.out.println("multiplication of mobileNum is..." + multiple);
			
			System.out.println(" ");
					SumArray sa= new SumArray();
			sa.sum(5);
	}
	
	

}
