package Exercise_2;

import java.util.Scanner;

/*
 * 1. WAP that allows the user to enter the names and prices of 5 items they want to buy. 
 * The program should then calculate the total cost and display a formatted shopping list using escape sequences?
 */
public class Q1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        String[] items = new String[5];
        double[] prices = new double[5];
        double totalCost = 0;
        

        // Input items and their prices
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of item " + (i + 1) + ": ");
            items[i] = scanner.nextLine();

            System.out.print("Enter the price of " + items[i] + ": ");
            prices[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            totalCost += prices[i];
        }

        // Display the formatted shopping list
        
        System.out.println("\nShopping List:");
        System.out.println("---------------");
        System.out.printf("%-15s\t%-10s\n", "Item", "Price (₹)");
        System.out.println("---------------");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-15s\t₹%-10.2f\n", items[i], prices[i]);
        }
        System.out.println("---------------");
        System.out.printf("Total Cost:\t\t₹%.2f\n", totalCost);
    }

}
