package print;

public class StarRightSide {
	public static void main(String[] args){
		int i,k;
		for(i=1; i<=6 ;i++){
			System.out.print(" ");

			for(k=1;k<(i);k++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(i=6;i>=1;i--){

			System.out.print(" ");

			for(k=1;k<i;k++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}

