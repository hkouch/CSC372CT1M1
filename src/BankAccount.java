//BankAccount class represents a basic bank account with a first & last name, account ID, and balance
public class BankAccount {
    //Private instance variables to store account information
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    //Default constructor initializes balance to 0
    public BankAccount() {
        balance = 0;
    }

    //Method to deposit a specified amount into the account
    public void deposit(double amount) {
        balance += amount;
    }

    //Method to withdraw a specified amount from the account
    public void withdrawal(double amount) {
        balance -= amount;
    }

    //Setter method to set the first name of the account holder
    public void setFirstName(String name) {
        this.firstName = name;
    }

    //Setter method to set the last name of the account holder
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Getter method to retrieve the first name of the account holder
    public String getFirstName() {
        return firstName;
    }

    //Getter method to retrieve the last name of the account holder
    public String getLastName() {
        return lastName;
    }

    //Getter method to retrieve the account ID
    public int getAccountID() {
        return accountID;
    }

    //Setter method to set the account ID
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    //Getter method to retrieve the account balance
    public double getBalance() {
        return balance;
    }

    //Method to display a summary of the account information
    public void accountSummary() {
        System.out.println("Account ID: " + accountID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.printf("Balance: $%.2f\n", balance);
    }
}