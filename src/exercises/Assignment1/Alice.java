package exercises.Assignment1;
import java.util.Scanner;

public class Alice {
    public static void main (String[] args) {
        String alice = "alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your search term (case-insensitive):");
        String searchTerm = input.nextLine();
        input.close();
        if (alice.contains(searchTerm.toLowerCase())) {
            System.out.println("Search term /"" + searchTerm found at index " + alice.indexOf(searchTerm))
        } else {
            System.out.println("Search term not found.");
        }


    }
}
