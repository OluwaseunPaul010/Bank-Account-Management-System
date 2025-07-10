import java.util.Scanner;

public class BankAccountManagementSystem {
    public static void main(String[] args) {
        Bank bank = new Bank("JavaBank");
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== " + bank.getBankName() + " Management System ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter account holder name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter initial balance: $");
                    double balance = scanner.nextDouble();
                    bank.createAccount(name, balance);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    String depositAccNum = scanner.nextLine();
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    bank.depositToAccount(depositAccNum, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    String withdrawAccNum = scanner.nextLine();
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdrawFromAccount(withdrawAccNum, withdrawAmount);
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    String displayAccNum = scanner.nextLine();
                    bank.displayAccountDetails(displayAccNum);
                    break;
                case 5:
                    System.out.println("Exiting... Thank you for using " + bank.getBankName() + "!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter 1-5.");
            }
        }
    }
}