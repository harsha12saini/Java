package mypkg;
import java.io.*;
import java.util.ArrayList;

public class split {
	public static void main(String[] args) throws IOException{
		//System.out.println("hello world...");
		
		FileReader fr = new FileReader("filetoread2.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		ArrayList<String> al = new ArrayList<String>();	
		
		//display all words
		System.out.println("Displaying all words -");
		while((str=br.readLine())!=null) {
			//System.out.println(str);
			String arr[] = str.split(" ");
			for(String a: arr) {
				System.out.println(a);
				al.add(a);
			
			}
		}
	    //displaying arraylist
		System.out.println("Displaying ArrayList -");
		for(int i=0; i<al.size(); i++) {
		System.out.println(al.get(i));
		}
		
		//reverse
		System.out.println("Displaying Reverse -");
		int l = al.size();
		for(int i = l-1; i>=0; i--) {
			System.out.println(al.get(i));
		}
		
		//display with all plurals(ending with s)
		int count=0;
		System.out.println("Displaying words ending with s -");
		for(int i=0; i<al.size(); i++) {
			String s = al.get(i);
			if(s.endsWith("s")) {
				System.out.println(al.get(i));
				count++;
			}
			}
		if(count==0)
			System.out.println("No words ending with s found");
		}
	}


