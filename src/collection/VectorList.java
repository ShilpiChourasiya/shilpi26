package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorList {

	public static void main(String[] args){
		Vector v1=new Vector();
		v1.add("Sweden");
		v1.add("8892100271");
		v1.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println("Printing contents of Vector v1 " +v1.get(0));

		Vector<Integer> vint=new Vector<Integer>();
		vint.add(3333);
		vint.add(1080);
		vint.add(3434);
		vint.set(2, 455);

		//System.out.println("Printing index of 455  -->> " +vint.indexOf(455));
		/*for(int i=0; i<vint.size();i++)
		{
		System.out.println("Printing contents of vector vint " +i+ " " +vint.get(i));
		}
		 */
		for(int i:vint){
			System.out.println("Printing contents of vector vint " +i+ " " +vint);
		}
		
		Iterator itr=vint.iterator();
		while(itr.hasNext())
		{
			System.out.println("Inside while loop");
			System.out.println(itr.next());
		}


	}
}
