import java.util.Scanner;

//Main class that contains the main method for program execution
public class Main {
    public static void main(String[] args) {
        //Create a Scanner object for user input
        Scanner scnr = new Scanner(System.in);
        
        //Create a BankAccount object
        BankAccount account1 = new BankAccount();

        //Prompt user for input and set account information
        System.out.print("Account's full name: ");
        account1.setFirstName(scnr.next());
        account1.setLastName(scnr.next());
        System.out.print("Account ID: ");
        account1.setAccountID(scnr.nextInt());
        System.out.print("Deposit amount: ");
        account1.deposit(scnr.nextDouble());
        System.out.print("Withdrawal amount: ");
        account1.withdrawal(scnr.nextDouble());

        //Display account summary
        account1.accountSummary();

        //Separator for better output separation
        System.out.println("\n-----------------\n");

        //Create a CheckingAccount object
        CheckingAccount checkingAccount1 = new CheckingAccount();

        //Prompt user for input and set checking account information
        System.out.print("Account's full name: ");
        checkingAccount1.setFirstName(scnr.next());
        checkingAccount1.setLastName(scnr.next());
        System.out.print("Account ID: ");
        checkingAccount1.setAccountID(scnr.nextInt());
        System.out.print("Deposit amount: ");
        checkingAccount1.deposit(scnr.nextDouble());
        System.out.print("Withdrawal amount: ");
        checkingAccount1.processWithdrawal(scnr.nextDouble());

        //Display checking account summary
        checkingAccount1.accountSummary();
        
        //Close the Scanner to prevent resource leak
        scnr.close();
    }
}