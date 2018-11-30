package abstration;

interface Calculation {
	
	void sum(int a, int b);
	void multiplication(int a, int b);
	void division(int a, int b);
}
interface Bank{
	void accountBalance(int c);
	void accountDetail(int d);
}
abstract class C implements Calculation{
	public void sum(int a, int b){
		 int k = a+b;
		System.out.println("Sum of Digits is...."+k);
	}
	public void multiplication(int a, int b){
		int k = a*b;
		System.out.println("multiplication of Digits is...."+k);
	}
	public abstract void division(int a, int b);
}
class B implements Bank,Calculation{
	public void accountBalance(int c) {
		System.out.println("User Account Balance is..."+c);
	}
	public void accountDetail(int d) {
		System.out.println("User Account Detail is..."+d);
	}
	
	public void sum(int a, int b){}
	public void multiplication(int a, int b){}
	public void division(int a, int b){}
}
class D extends C{
	public void division(int a,int b){
		int k= a/b;
		System.out.println("Division of Digits is...."+k);
	}
	public static void main (String... args){
	B t= new B();
	t.accountBalance(10000);
	t.accountDetail(131);
	System.out.println(" ");
	D s= new D();
	s.sum(10,20);
	s.multiplication(10,20);
	s.division(20,10);
	}
}