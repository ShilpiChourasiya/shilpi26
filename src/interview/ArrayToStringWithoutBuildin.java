package interview;

public class ArrayToStringWithoutBuildin {
public static void main(String args[]){
	String[] s= {"Apple", "Banana", "Apple", "Guava"};
	String s1 = "[";
	for(int i=0; i<s.length; i++){
		if(i>0){
			s1=s1+",";
		}
		String s2=s[i];
		s1=s1+s2;
	}
	s1 = s1 + "]";
	System.out.println(s1);
	
}
}
