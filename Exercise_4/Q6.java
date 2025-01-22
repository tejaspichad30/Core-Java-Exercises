package Exercise_4;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
/*
 * Q6. ATM Withdrawal with Multiple Conditions
 Simulate a more complex ATM withdrawal process.

a. If the account balance is less than the withdrawal amount, print "Insufficient funds."
b. If the account balance is sufficient, check if the withdrawal amount is greater than $1000.
If yes, print "A transaction fee of $10 will be applied."
If no, print "No transaction fee."
Deduct the amount from the balance and print the new balance.
If the balance after withdrawal is less than $100, print "Warning: Low balance."

 */
		Scanner sc = new Scanner(System.in);

        // Input: Account balance and withdrawal amount
        System.out.print("Enter account balance: $");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: $");
        double withdrawalAmount = sc.nextDouble();

        // Check if balance is less than withdrawal amount
        if (withdrawalAmount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            // Check if withdrawal amount is greater than $1000
            if (withdrawalAmount > 1000) {
                System.out.println("A transaction fee of $10 will be applied.");
                withdrawalAmount += 10; // Add transaction fee
            } else {
                System.out.println("No transaction fee.");
            }

            // Deduct withdrawal amount from balance
            balance -= withdrawalAmount;
            System.out.printf("Withdrawal successful. New balance: $%.2f\n", balance);

            // Check if balance is less than $100 after withdrawal
            if (balance < 100) {
                System.out.println("Warning: Low balance.");
            }
        }

        sc.close(); // Close scanner
	}

}
