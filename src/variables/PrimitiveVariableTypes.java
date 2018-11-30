package variables;

public class PrimitiveVariableTypes {
	byte v;
	byte v1=12;
	short n;
	short n1= 12345;
	int a;
	int a1=5;
	long l;
	long l1= 1234567890;
	double d;
	double d1= 11.6;
	float f;
	float f1= 10.5f;
	boolean bool;
	boolean bool1=true;
	char c;
	char c1= 'z';
	String s;
	String s1 = "Tiger";
	static PrimitiveVariableTypes pvt;// Static object created


	public static void main(String[] args){
		PrintMethod pm= new PrintMethod();//created an object of PrintMethod class.	
		pvt= new PrimitiveVariableTypes();//created an object of PrimitiveVariableTypes class.	
		System.out.println("***Running Main Method***");
		System.out.println("value of declared int -->> " +pm.a);
		System.out.println("value of declared & initialised int -->> " +pm.a1);
		System.out.println("value of declared byte -->> " +pm.v);
		System.out.println("value of declared & initialised byte -->> " +pm.v1);
		System.out.println("value of declared short -->> " +pm.n);
		System.out.println("value of declared & initialised short -->> " +pm.n1);
		System.out.println("value of declared long -->> " +pm.l);
		System.out.println("value of declared & initialised long -->> " +pm.l1);
		System.out.println("value of declared double -->> " +pm.d);
		System.out.println("value of declared & initialised double -->> " +pm.d1);
		System.out.println("value of declared float -->> " +pm.f);
		System.out.println("value of declared & initialised float -->> " +pm.f1);
		System.out.println("value of declared boolean -->> " +pm.bool);
		System.out.println("value of declared & initialised boolean -->> " +pm.bool1);
		System.out.println("value of declared charcter -->> " +pm.c);
		System.out.println("value of declared & initialised charcter -->> " +pm.c1);
		System.out.println("value of declared String -->> " +pm.s);
		System.out.println("value of declared & initialised String -->> " +pm.s1);
		pm.printVariables();//call a user defined method using object. where pm is object of PrintMethod class.
		pvt.printVariablesInStaticMethod();//call a user defined method using object. where pvt is object of PrimitiveVariableTypes class.
	}


 void printVariablesInStaticMethod() {
		//PrimitiveVariableTypes pvt= new PrimitiveVariableTypes();
		System.out.println();
		System.out.println("***Running printVariablesInStaticMethod Method***");
		System.out.println("value of declared int -->> " +pvt.a);
		System.out.println("value of declared & initialised int -->> " +pvt.a1);
		System.out.println("value of declared byte -->> " +pvt.v);
		System.out.println("value of declared & initialised byte -->> " +pvt.v1);
		System.out.println("value of declared short -->> " +pvt.n);
		System.out.println("value of declared & initialised short -->> " +pvt.n1);
		System.out.println("value of declared long -->> " +pvt.l);
		System.out.println("value of declared & initialised long -->> " +pvt.l1);
		System.out.println("value of declared double -->> " +pvt.d);
		System.out.println("value of declared & initialised double -->> " +pvt.d1);
		System.out.println("value of declared float -->> " +pvt.f);
		System.out.println("value of declared & initialised float -->> " +pvt.f1);
		System.out.println("value of declared boolean -->> " +pvt.bool);
		System.out.println("value of declared & initialised boolean -->> " +pvt.bool1);
		System.out.println("value of declared charcter -->> " +pvt.c);
		System.out.println("value of declared & initialised charcter -->> " +pvt.c1);
		System.out.println("value of declared String -->> " +pvt.s);
		System.out.println("value of declared & initialised String -->> " +pvt.s1);
	}


}
