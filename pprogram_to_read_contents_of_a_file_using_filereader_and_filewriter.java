package mypkg;

import java.io.*;

public class demo {
	public static void main(String[] args) throws IOException{
		System.out.println("hello world...");
		
		FileReader fr = new FileReader("filetoread2.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
	}
}
