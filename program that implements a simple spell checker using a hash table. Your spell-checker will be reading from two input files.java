package mypkg;

import java.io.*;

import java.util.*;

 class Main{

	HashSet<String> s = new HashSet<String>();

	void Reading_file()throws IOException{

		FileReader fr = new FileReader("dictionary.txt");

		BufferedReader br = new BufferedReader(fr);

		String str;

		while((str=br.readLine())!=null) {

			s.add(str.toLowerCase());

		}

	}

	void Check_word()throws IOException {

			FileReader fr1 = new FileReader("words.txt");

		BufferedReader br1 = new BufferedReader(fr1);

		String str1;
		System.out.println("misspelled words - ");

		while((str1 = br1.readLine())!=null) {

			String[] words = str1.split("\\s+");

			for(String element:words) {

				if(!s.contains(element.toLowerCase())) {

					System.out.println(element);

					}

				}

			}

		}

	}	

public class set {

		public static void main(String[] args) throws IOException {

			Main ob = new Main();

			ob.Reading_file();

			ob.Check_word();

		}

	}