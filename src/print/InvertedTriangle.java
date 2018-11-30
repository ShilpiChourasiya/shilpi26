package print;

public class InvertedTriangle {
	public static void main(String[] args){
		int a,b,c;
		for(b=6;b>0;b--){
			for(a=6;b<a;a--){
				System.out.print(" ");
			}
			
			for(c=1;c<=(2*b-1);c++){			
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
