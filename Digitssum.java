import java.util.Scanner;

public class Digitssum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int sum = 0;
        int originalNumber = number;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("The sum of the digits of " + originalNumber + " is: " + sum);

        scanner.close();
    }
}
