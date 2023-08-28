package mypkg;
import java.util.*;
public class reverse_priorityqueue {

	 
	class Main{

	    public static void main(String args[])
	    {
	        PriorityQueue<String> pQueue
	            = new PriorityQueue<String>(Collections.reverseOrder());
	 
	    
	        pQueue.add("mon");
	        pQueue.add("tues");
	        pQueue.add("wed");
	        pQueue.add("thurs");
	        while(!pQueue.isEmpty())
			System.out.println(pQueue.remove());
	}}
}
