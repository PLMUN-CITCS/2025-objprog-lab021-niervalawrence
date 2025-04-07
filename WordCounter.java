import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        // Get sentence input from the user
        String sentence = getSentenceInput();

        // Count the number of words in the sentence
        int wordCount = countWords(sentence);

        // Display the word count to the user
        System.out.println("The sentence has " + wordCount + " words.");
    }

    // Method to get the sentence input from the user
    public static String getSentenceInput() {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        
        // Read the entire sentence as a string
        String sentence = scanner.nextLine();

        // Return the sentence
        return sentence;
    }

    // Method to count the number of words in a sentence
    public static int countWords(String sentence) {
        // Trim leading/trailing spaces and split the sentence into words
        String[] words = sentence.trim().split("\\s+");

        // Return the number of words in the array
        return words.length;
    }
}
