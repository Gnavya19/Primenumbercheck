import java.util.Scanner;

public class PrimeNumberCheck {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        // If the number is less than 2, it's not prime
        if (num <= 1) {
            return false;
        }

        // Check if the number has any divisors other than 1 and itself
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // Found a divisor, so it's not prime
            }
        }

        return true;  // No divisors found, it's prime
    }

    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        // Call the isPrime function and store the result
        boolean result = isPrime(number);

        // Display whether the number is prime or not
        if (result) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }
}
