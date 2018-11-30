package array;

import java.util.Arrays;

public class FindLargestIntInArray {

	public static void main(String[] args){
		int ar[]=new int[5];

		ar[0]=33;
		ar[1]=11;
		ar[2]=99;
		ar[3]=44;
		ar[4]=99;

		System.out.println("length of array is " +ar.length);
		int counter;
		for(int i=0;i<ar.length;i++){
			counter=0;
			for(int j=0;j<ar.length;j++){
				if(ar[i]>=ar[j]){
					counter++;
				
					if(counter==ar.length){
						System.out.println("The highest integer stored at index number =" +i+ " and the value is =" +ar[i]);
					break;
					}
				}

			}


		}


	}
}
