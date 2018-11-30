package operator;
import operator.OprMethod;

public class Opr {


	public static void main(String args[])
	{
		OprMethod objectoprMethodClass=new OprMethod();
		byte a,b,c;
		a=10; b=20;
		//b=assign(a);
		//c=allocate(a);

		b=objectoprMethodClass.assign(a);
		c=objectoprMethodClass.allocate(a);

		System.out.println(a +" , "+ b+" , "+c);


	}

}



