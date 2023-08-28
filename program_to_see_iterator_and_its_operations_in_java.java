package mypkg;

import java.util.LinkedList;
import java.util.ListIterator;

public class iterator {
public static void main(String args[]) {
	LinkedList<String> staff = new LinkedList<>();
	staff.addLast("Diana");
	staff.addLast("Vipul");
	staff.addLast("Lisa");
	staff.addLast("Devi");
	staff.addLast("Paxton");
	ListIterator<String> iterator = staff.listIterator();
	iterator.next();
	iterator.next();
	
	//adding more elements
	iterator.add("Nish");
	iterator.add("Nikita");
	iterator.next();
	
	//remove last traversed element
	iterator.remove();
	
	//printing all elements
	for(int i=0; i<staff.size(); i++) {
	System.out.println(staff.get(i));
	}

	}
}
