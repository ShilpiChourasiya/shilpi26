package print;
import java.util.Scanner;

public class Names{
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
for(int i =1; i<4;i++)
{
System.out.println("Enter Your First Name...");
String s1 = in.next();
System.out.println("Enter Your Last Name...");
String s2 = in.next();
System.out.println("Enter Your Age...");
int n = in.nextInt();
System.out.println("  User "+s1+" "+s2+" has age -->"+n);
}

}
}
