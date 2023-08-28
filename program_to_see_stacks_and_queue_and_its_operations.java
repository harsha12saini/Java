package mypkg;
import java.util.*;
public class stacks_and_queue {
public static void main(String args[]) {
	Stack<Integer> stack = new Stack<>();
	System.out.println("-STACKS-");
	
	System.out.println("empty stack" +stack);
	System.out.println("is stack empty or not -" +stack.isEmpty());
	stack.push(101);
	stack.push(102);
	stack.push(103);
	stack.push(104);
	System.out.println("non-empty stack- " +stack);
	System.out.println("pop operation - " +stack.pop());
	System.out.println("after pop operation - " +stack);
	System.out.println("search operation - " +stack.search(103));
	System.out.println("peek operation - " +stack.peek());
	System.out.println("is stack empty or not - " +stack.isEmpty());
	System.out.println("size operation - " +stack.size());
	
	System.out.println();
	System.out.println("-QUEUE-");
	Queue<String> queue = new LinkedList<>();
	queue.add("monday");
	queue.add("tuesday");
	queue.add("wednesday");
	queue.add("thursday");
	queue.add("friday");
	queue.add("saturday");
	queue.add("sunday");
	System.out.println("original queue - " +queue);
	queue.remove("wednesday");
	System.out.println("after removal - " +queue);
	Object obj[]= queue.toArray();
	queue.remove(obj[3]);
	System.out.println("after removal using index - " +queue);
	System.out.println(queue.contains("tuesday"));
	System.out.println("peek operation - " +queue.peek());
	System.out.println("element operation - " +queue.element());
	
}
}
