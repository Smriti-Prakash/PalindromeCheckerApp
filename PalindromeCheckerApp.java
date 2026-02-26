/**
 * Use Case 1 - Palindrome Checker App
 * Objective: Display welcome message and application details at startup
 * Application Name: Palindrome Checker App
 * Version: 1.0
 */

public class UseCase1PalindromeCheckerApp {

    // Application Constants
    private static final String APPLICATION_NAME = "Palindrome Checker App";
    private static final String APPLICATION_VERSION = "1.0";

    /**
     * Entry Point of the Application
     * JVM invokes this method automatically
     */
    public static void main(String[] args) {

        // Welcome Banner
        System.out.println("===============================================");
        System.out.println("        Welcome to " + APPLICATION_NAME);
        System.out.println("===============================================");
        System.out.println("Application Version : " + APPLICATION_VERSION);
        System.out.println("Description         : Console-based Palindrome Validation App");
        System.out.println("===============================================");

        // Flow Control Message
        System.out.println("\nApplication started successfully...");
        System.out.println("Proceeding to next use case...\n");
    }
}