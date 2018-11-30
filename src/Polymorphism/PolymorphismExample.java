package Polymorphism;

public class PolymorphismExample {
	int eid;
	String ename;
	double esal;
	void m1(){
		eid= 118;
		ename= "shilpi";
		esal= 30000;	
	}
	}
class Subclass extends PolymorphismExample{
	void m1(){
		System.out.println();
	}
}


