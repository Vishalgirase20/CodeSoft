package JavaPackage;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000; // Initial balance
        int choice;

        do {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Check Balance()");
            System.out.println("2. Deposit amount");
            System.out.println("3. Withdraw amount");
            System.out.print("Please choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = scanner.nextInt();
                    balance += deposit;
                    System.out.println("You have successfully deposited: " + deposit);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = scanner.nextInt();
                    if (withdraw > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                    	balance -= withdraw;
                        System.out.println("You have successfully withdrawn: " + withdraw);
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
            System.out.println();
        } while (choice != 4);

        scanner.close();
    }
}
