package mypkg;
import java.util.*;
public class priority_queue {
	
	public static void main(String args[]) {
		PriorityQueue<Integer> numbers = new PriorityQueue<>();

		numbers.add(750);
		numbers.add(500);
		numbers.add(900);
		numbers.add(100);
		numbers.add(1000);
		numbers.add(200);
		numbers.add(400);
		System.out.println("PRIORITY QUEUE");
		while(!numbers.isEmpty())
		System.out.println(numbers.remove());
		
		
		
		
}}
