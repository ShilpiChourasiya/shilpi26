package age;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateExample {
public static void main(String... args)throws Exception {
	String s= "03/04/11";
	SimpleDateFormat sdf=new SimpleDateFormat("DD/MM/YYYY hh:mm:ss");
	Date date1= new Date();
	date1=sdf.parse(s);
	System.out.println (date1+"/t"+sdf);
	
}
}