package java_concepts;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Consume the remaining newline character left by nextInt() to prepare for next input
        scanner.nextLine();

        // Prompt the user to enter their favorite color
        System.out.print("Enter your favorite color: ");
        String favoriteColor = scanner.nextLine();

        // Display the gathered information
        System.out.println("\nHello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite color is " + favoriteColor + ".");

        // Close the scanner to free up resources
        scanner.close();
    }
}


