//CheckingAccount class extends the BankAccount class and adds an interest rate
public class CheckingAccount extends BankAccount {
    //Private instance variable to store the interest rate for the checking account
    private double interestRate;

    //Default constructor for CheckingAccount initializes balance & interest rate to 0
    public CheckingAccount() {
        super(); //Call the default constructor of the parent class (BankAccount)
        interestRate = 0;
    }

    //Method to process a withdrawal from the checking account
    //If the withdrawal results in a negative balance, apply an overdraft fee
    public void processWithdrawal(double amount) {
        if (getBalance() - amount < 0) {
            super.withdrawal(54); //Chase Overdraft fee
        }
        super.withdrawal(amount); //Call the parent withdrawal function 
    }

    //Display a summary of the checking account information
    public void displayAccount() {
        super.accountSummary(); //Call the accountSummary method from the parent class
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}