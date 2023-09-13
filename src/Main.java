import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double result = 0.0;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");

        // Read an integer from the user
        n = input.nextInt();

        // Initialize a variable to store the result

        // Loop from 1 to n and calculate the sum of the harmonic series
        for (double i = 1; i <= n; i++) {
            result += 1 / i; // Add the reciprocal of each number to the result
        }

        // Print the result of the harmonic series
        System.out.println("Result = " + result);
    }
}
