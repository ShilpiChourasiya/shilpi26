package variables;
import print.InvertedTriangle;

public class PrintMethod {
	
	byte v;
	byte v1=54;
	short n;
	short n1= 5432;
	int a;
	int a1=5;
	long l;
	long l1= 512345678;
	double d;
	double d1= 51.6;
	float f;
	float f1= 50.5f;
	boolean bool;
	boolean bool1= true;
	char c;
	char c1= 'y';
	String s;
	String s1 = "I m Tiger";
	PrintMethod t;
	public static void main(String[] args){
		PrintMethod pMethod = new PrintMethod();
		InvertedTriangle it = new InvertedTriangle();
		it.main(args);
		pMethod.printVariables();
	}
	 void printVariables() {
		System.out.println();
		System.out.println(" ***Running PrintVariables Method***");
		System.out.println("value of declared int  -->> " +a);
		System.out.println("value of declared & initialised int -->> " +a1);
		System.out.println("value of declared byte -->> " +v);
		System.out.println("value of declared & initialised byte -->> " +v1);
		System.out.println("value of declared short -->> " +n);
		System.out.println("value of declared & initialised short-->> " +n1);
		System.out.println("value of declared long -->> " +l);
		System.out.println("value of declared & initialised long -->> " +l1);
		System.out.println("value of declared double -->> " +d);
		System.out.println("value of declared & initialised double-->> " +d1);
		System.out.println("value of declared float -->> " +f);
		System.out.println("value of declared & initialised float -->> " +f1);
		System.out.println("value of declared boolean -->> " +bool);
		System.out.println("value of declared & initialised boolean -->> " +bool1);
		System.out.println("value of declared char -->> " +c);
		System.out.println("value of declared & initialised char -->> " +c1);
		System.out.println("value of declared String -->> " +s);
		System.out.println("value of declared & initialised String -->> " +s1);
	}

}
