package print;

public class StarTriangle {
	public static void main(String[] args){
		int i,j,k;
		for(i=1; i<=6 ;i++){
			for(j=i; j<=6; j++){
				System.out.print(" ");
			}
			for(k=1;k<(i);k++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(i=6;i>=1;i--){
			for(j=7;j>i;j--){
				System.out.print(" ");
			}
			for(k=1;k<i;k++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
