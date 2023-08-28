package mypkg;

import java.util.LinkedList;

public class linkedlist {
	public static void main(String args[]) {
		LinkedList<String> staff = new LinkedList<>();
		//System.out.println("adding at last -");
		staff.addLast("Diana");
		staff.addLast("Vipul");
		staff.addLast("Lisa");
		staff.addLast("Devi");
		staff.addLast("Paxton");
		System.out.println();
		System.out.println("arraylist -");
		for(int i=0; i<staff.size(); i++) {
			System.out.println(staff.get(i));
			}
		System.out.println();
		//System.out.println("after adding -");
		staff.add("Tanuj");
		
		//printing arraylist after adding tanuj
		System.out.println("arraylist -");
		for(int i=0; i<staff.size(); i++) {
			System.out.println(staff.get(i));
			}
		
		//System.out.println("adding element and index -");
		System.out.println();
		
		System.out.println("get -");
		System.out.println(staff.get(5));
		System.out.println();
		
		System.out.println("remove -");
		staff.remove("Paxton");
		System.out.println();

		System.out.println("arraylist -");
		for(int i=0; i<staff.size(); i++) {
			System.out.println(staff.get(i));
			}
		System.out.println();
		
		System.out.println("remove via index-");
		System.out.println(staff.remove(3));
		System.out.println("arraylist -");
		for(int i=0; i<staff.size(); i++) {
			System.out.println(staff.get(i));
			}
		
		System.out.println();
		
		System.out.println("contains -");
		System.out.println(staff.contains("Tanuj"));
		System.out.println();
		
		System.out.println("set -");
		System.out.println(staff.set(1, "Bharti"));
		System.out.println();
		
		System.out.println("arraylist -");
		for(int i=0; i<staff.size(); i++) {
			System.out.println(staff.get(i));
			}
		System.out.println();
		
		System.out.println("indexof -");
		System.out.println(staff.indexOf("Tanuj"));
		System.out.println();
		
		//System.out.println("tostring -");
		System.out.println("size - " +staff.size());
		System.out.println(staff.toString());
		//System.out.println(staff.toArray());
		Object obj[] = staff.toArray();
		System.out.println("Array - " +obj[1]);
		
		System.out.println();
		
		//printing arraylist again
		System.out.println("new arraylist -");
		for(int i=0; i<staff.size(); i++) {
			System.out.println(staff.get(i));
			}
		
		
		
	}}
		


