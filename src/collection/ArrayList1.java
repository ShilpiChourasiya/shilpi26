package collection;

import java.util.ArrayList;

//import java.util.*;
public class ArrayList1 {
public static void main(String[] args){
ArrayList<String> al =new ArrayList<String>();
//ArrayList<String> al2 =new ArrayList<String>();
al.add("43");
al.add("A");
//al.add(522);
al.add("apple");
al.add("null");
System.out.println("value at second index is.... "+al.get(1));
//System.out.println("removing value at index[2] .... "+al.remove(2));
System.out.println("print all values.... " +al);
System.out.println("Does collection al contains apple -- >>" +al.contains("apple"));
System.out.println("Does collection al contains tata -- >>" +al.contains("tata"));
al.add("tata");
System.out.println("Does collection al contains tata -- >>" +al.contains("tata"));
al.add("tata");
al.add("apple");
al.add("apple");
al.add("tata");
al.add("null");
al.add("43");
al.add("tata");
al.add("43");
System.out.println("print all values.... " +al);

//int sizeofarraylist= al.size();
for(int i =0; i<=al.size();i++){
	for(int j=i+1;j<al.size();j++){
		if (al.get(i)== al.get(j)){
			al.remove(j);
		}
	}
}
System.out.println("remove duplicate values..." +al);
	}

}
