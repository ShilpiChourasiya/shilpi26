package Polymorphism;

public class Example {
void m1(int a){
	System.out.println("integer first");
}
void m1(int a,int b){
	System.out.println("integer second");
}
void m1(double d,int a, int b){
	System.out.println("integer third");
}
public static void main (String[] args){
	Example E=new Example();
	E.m1(10);
	E.m1(10,20);
	//E.m1(a,20); variable must be of same datatype
	E.m1(10,20,5);
}
}
