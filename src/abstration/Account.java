package abstration;

public abstract class Account { //  only public, abstract & final are permitted
	int c =2;
double currentBalance(int cb)
{
	double d=cb*2;
	System.out.println("User has Current balance is..." +d);
	return d;
	
}
double lastFiveTransaction(){
	System.out.println("list of five transaction is...");
	return c;
}
abstract double avgBalance();
int customerDetails(int actid)
{
	System.out.println("User account id is..." +actid);
	return c;
}
}
class MiniStatement extends Account{
	double avgBalance(){
		System.out.println("Avrage balance of user is...");
		return c;
	}
}
abstract class Transaction extends Account{
	double lastFiveTransaction(){
		System.out.println("User last five transaction is...");
		return c;
	}
}
class CompleteTransactionSumarry extends Transaction{
	double avgBalance()
	{
		System.out.println("Your avrage balance is...");
		return c;
	}
	public static void main(String... args){
		CompleteTransactionSumarry cts=new CompleteTransactionSumarry();
		cts.currentBalance(55);
		cts.lastFiveTransaction();
		cts.avgBalance();
		cts.customerDetails(1376);
		System.out.println(" ");
		MiniStatement ms = new MiniStatement();
		ms.currentBalance(56);
		ms.lastFiveTransaction();
		ms.avgBalance();
		ms.customerDetails(2238);
	}
}