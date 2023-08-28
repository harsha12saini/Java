package mypkg;
import java.util.*;

public class reverse_stack{
	    public static void main(String[] args) {
	        String reversedResult = reverseWordsUsingScanner();
	        System.out.println(reversedResult);
	    }

	    public static String reverseWordsUsingScanner() {
	        Stack<String> stack = new Stack<>();
	        List<String> reversedSentence = new ArrayList<>();
	        List<String> li = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
            String word = scanner.nextLine();
            String a[] = word.split(" ");
	       // while (word.endsWith(".")) {
	          //  stack.push(word);
            for(int i=0; i<a.length; i++) {
	            if (a[i].endsWith(".")) {
	                while (!stack.isEmpty()) {
	                    reversedSentence.add(stack.pop());
	                }
	                break;
	            }
	        }

	        return String.join(" ", reversedSentence);
	    }
	}


