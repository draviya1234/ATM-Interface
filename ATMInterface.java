import java.util.Scanner;
public class ATMInterface {
   
        private static double balance = 1000.0; // Initial balance
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;
    
            System.out.println("Welcome to the ATM Interface!");
    
            while (!exit) {
                System.out.println("\nPlease select an option:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
    
                int choice = scanner.nextInt();
    
                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        depositMoney(scanner);
                        break;
                    case 3:
                        withdrawMoney(scanner);
                        break;
                    case 4:
                        exit = true;
                        System.out.println("Thank you for using the ATM. Visit Again!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
    
            scanner.close();
        }
    
        private static void checkBalance() {
            System.out.printf("Your current balance is: %.2f\n", balance);
        }
    
        private static void depositMoney(Scanner scanner) {
            System.out.print("Enter the amount to deposit: ");
            double amount = scanner.nextDouble();
    
            if (amount > 0) {
                balance += amount;
                System.out.printf("Successfully deposited %.2f. Your new balance is: %.2f\n", amount, balance);
            } else {
                System.out.println("Invalid amount. Please enter a positive value.");
            }
        }
    
        private static void withdrawMoney(Scanner scanner) {
            System.out.print("Enter the amount to withdraw: ");
            double amount = scanner.nextDouble();
    
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.printf("Successfully withdrew %.2f. Your new balance is: %.2f\n", amount, balance);
            } else if (amount > balance) {
                System.out.println("Insufficient balance.");
            } else {
                System.out.println("Invalid amount. Please enter a positive value.");
            }
        }
    }
    

