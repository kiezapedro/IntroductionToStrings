import java.util.ArrayList;
import java.util.Scanner;

public class StringCall {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input number of characters
        System.out.print("Enter the number of characters: ");
        int n = scn.nextInt();
        scn.nextLine(); // Consume newline

        // Create ArrayList to store characters
        ArrayList<String> characters = new ArrayList<>();

        // Input characters one by one
        System.out.println("Enter the characters (one by one):");
        for (int i = 0; i < n; i++) {
            String character = scn.nextLine();
            characters.add(character);
        }

        // Build the original string
        String original = "";
        for (int i = 0; i < characters.size(); i++) {
            original = original + characters.get(i);
        }

        // Print original string and the length
        System.out.println("Original String: " + original);
        System.out.println("String length: " + original.length());

        // Build the reversed string
        String reverse = "";
        for (int i = characters.size() - 1; i >= 0; i--) {
            reverse = reverse + characters.get(i);
        }

        // Print reversed string
        System.out.println("Reversed String: " + reverse);

        // Print two equal words if even length
        if (characters.size() % 2 == 0) {
            System.out.print("Two equal words: ");
            for (int i = 0; i < characters.size() / 2; i++) {
                System.out.print(characters.get(i));
            }
            System.out.print(" and ");
            for (int i = characters.size() / 2; i < characters.size(); i++) {
                System.out.print(characters.get(i));
            }
            System.out.println();
        } else {
            System.out.println("Cannot make two equal words because the string's length is odd.");
        }

        scn.close();
    }
}
