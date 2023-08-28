package mypkg;
import java.util.*;

public class ReverseSentenceWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String reversed = reverseWordsInSentence(inputSentence);
        System.out.println("Reversed sentence: " + reversed);

        scanner.close();
    }

    public static String reverseWordsInSentence(String sentence) {
        String[] words = sentence.split(" ");
        Stack<String> stack = new Stack<>();
       
        for (String word : words) {
            stack.push(word);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop()).append(" ");
        }

        return reversed.toString().trim();
    }
}
