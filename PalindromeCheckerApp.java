/**
 * Use Case 2 - Hardcoded Palindrome Check
 * Objective: Check whether a hardcoded string is a palindrome
 */

public class PalindromeCheckerApp {
    public static void main(String[] args){
        // Hardcoded String (String Literal)
        String word = "madam";

        // Reverse the string
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }

        // Conditional Statement to check palindrome
        if (word.equals(reversedWord)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }

}