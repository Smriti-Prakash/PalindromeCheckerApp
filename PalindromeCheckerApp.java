/**
 * Use Case 3 - Palindrome Check Using String Reverse
 * Objective: Reverse a string using loop and compare with original
 */


public class PalindromeCheckerApp {
    public static void main(String[] args){

        // Original String
        String original = "level";

        // Reversed String (empty initially)
        String reversed = "";

        // Loop to reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);  // String concatenation
        }

        // Display reversed string
        System.out.println("Original String : " + original);
        System.out.println("Reversed String : " + reversed);

        // Compare using equals() method
        if (original.equals(reversed)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");

    }

}