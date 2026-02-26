/**
 * Use Case 2 - Hardcoded Palindrome Check
 * Objective: Check whether a hardcoded string is a palindrome
 */

public class PalindromeCheckerApp {
    public static void main(String[] args){

        public static void main(String[] args) {


            String word = "madam";

            String reversedWord = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord = reversedWord + word.charAt(i);
            }

            if (word.equals(reversedWord)) {
                System.out.println("The word \"" + word + "\" is a Palindrome.");
            } else {
                System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
            }

            System.out.println("Program executed successfully.");
        }
    }

}