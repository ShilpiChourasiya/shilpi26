package collection;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main (String[] args){
		LinkedList ll=new LinkedList();
		ll.add("a");
		ll.add("b");
		ll.add("apple");
		ll.add(3);
		ll.add(5);
		ll.add("orange");
		
		ll.add(2,"a");
		System.out.println(ll);
		System.out.println("value at first index ....--> "+ll.getFirst());
		System.out.println(" ");
		ll.set(2,"orange");
		System.out.println(ll);
		System.out.println("value at third index  ....--> "+ll.get(2));
		System.out.println(" ");
		//System.out.println("value after removing last index...--> "+ll.removeLast());
		System.out.println("value at last index after remove last index....--> "+ll.getLast());
		System.out.println(ll);
		
		System.out.println(" ");
		System.out.println("value after removing orange...--> "+ll.remove("orange"));
		System.out.println(ll);
	}

}
