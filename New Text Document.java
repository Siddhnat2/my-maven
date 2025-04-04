import java.util.Scanner;  // Import Scanner for user input
import java.util.Random;   // Import Random for generating numbers

public class HelloWorld {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read user input
        
        // Generate a random number
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;  // Random number between 1 and 100

        // Print output
        System.out.println("Hello, " + name + "!");
        System.out.println("Your lucky number today is: " + randomNumber);

        // Close the scanner
        scanner.close();
    }
}
