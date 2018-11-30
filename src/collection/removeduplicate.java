package collection;
import java.util.ArrayList;
public class removeduplicate {
	public static void main(String[] args){
		ArrayList<String> al =new ArrayList<String>();
		ArrayList<String> al2 =new ArrayList<String>();
		al.add("43");
		al.add("A");
		al.add("522");
		al.add("41");
		al.add("null");
		al.add("tata");
		al.add("tata");
		al.add("41");
		al.add("41");
		al.add("tata");
		al.add("null");
		al.add("43");
		al.add("tata");
		al.add("43");
		System.out.println("print all values.... " +al);
		
		for(int i =0; i<al.size();i++){
			for(int j=i+1;j<al.size();j++){
				//if (al.get(i)== al.get(j)){
				if(al.get(i).equals(al.get(j))){
					al.remove(j);
					j--;
				}
			}
		}
		System.out.println("remove duplicate values..." +al);
		
		
	/*	ArrayList<String> al = new ArrayList<String>();
		al.add("Krishna");
        al.add("Krishn");
        al.add("Aryan");
        al.add("Harm");
        al.add("Krishna");
        al.add("Krishna");
        al.add("null");
        al.add("1234");
        al.add("null");
        al.add("Aryan");
        System.out.println("List"+al);

        for (int i = 1; i < al.size(); i++) {
            String a1 = al.get(i);
            String a2 = al.get(i-1);
            if (a1.equals(a2)) {
                al.remove(a1);
            }
        }

        System.out.println("List after short"+al);
	}
	*/
}
}
