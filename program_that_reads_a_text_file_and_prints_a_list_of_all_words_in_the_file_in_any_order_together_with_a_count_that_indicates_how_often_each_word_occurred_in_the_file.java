package mypkg;

import java.io.*;
import java.util.*;

public class map2 {
	 public static void main(String[] args) throws FileNotFoundException, IOException{
	        Map<String, Integer> program = new HashMap<>();
	        Scanner scanner = new Scanner(System.in);
	        FileReader fr = new FileReader("alice.txt");
			BufferedReader br = new BufferedReader(fr);
			String str;
		
			int count=0;
			while((str=br.readLine())!=null) {
				String arr[] = str.split(" ");
			
				for(String a: arr) {
					a=a.toLowerCase();
					if(program.containsKey(a)) {
			     		 count = program.get(a)+1;
					}
					else
						count=1;
					
					program.put(a,count);
				
				}
			}
			
			for (Map.Entry<String, Integer> entry : program.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
					
					
				
			
}
}