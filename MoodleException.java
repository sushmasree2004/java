/* Question1: Write a Java program that simulates a simple calculator. The program should read two numbers as strings (converted to integer after reading a string) and an operator (+, -, *, /) from the user. Implement exception handling for the following scenarios:
•	If the user enters a non-numeric value for either of the numbers, throw a NumberFormatException.
•	If the user enters an invalid operator, throw a custom exception called InvalidOperatorException.
•	If the user attempts to divide by zero, throw an ArithmeticException. Handle these exceptions and display meaningful error messages to the user.
import java.util.Scanner;
// Custom exception for invalid operators

class InvalidOperatorException extends Exception {

    public InvalidOperatorException(String message) {
        super(message);
    }
}

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read the first number
            System.out.print("Enter the first number: ");
            double num1 = Double.parseDouble(scanner.next());

            // Read the operator
            System.out.print("Enter the operator (+, -, *, /): ");
            String operator = scanner.next();

            // Read the second number
            System.out.print("Enter the second number: ");
            double num2 = Double.parseDouble(scanner.next());
            double result = 0;
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    } else {
                        result = num1 / num2;
                        break;
                    }
                default:
                    throw new InvalidOperatorException("Invalid operator entered. Please enter +, -, *, or /.");
            }
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number entered. Please enter a valid numeric value.");
        } catch (InvalidOperatorException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {

            scanner.close();
        }

    }

}





Question2: You are tasked with implementing a simple banking system in Java. The system should allow customers to create accounts, deposit funds, withdraw funds, and check their balance. However, you need to handle exceptions carefully to ensure the system's reliability.
Implement the BankAccount class with the following specifications:
1.	A BankAccount should have the following attributes:
o	accountNumber (a unique identifier for each account)
o	accountHolderName (the name of the account holder)
o	balance (the current account balance)
2.	Implement the following methods in the BankAccount class:
o	deposit(double amount): This method should allow the account holder to deposit a positive amount of money into their account. If the amount is negative or zero, it should throw a NegativeAmountException. If the amount is greater than the maximum deposit limit (e.g., $10,000), it should throw a DepositLimitExceededException.
o	withdraw(double amount): This method should allow the account holder to withdraw a positive amount of money from their account as long as the balance is sufficient. If the amount is negative or zero, it should throw a NegativeAmountException. If the amount is greater than the account's balance, it should throw an InsufficientFundsException.
o	getBalance(): This method should return the current balance of the account.
3.	Define the following custom exceptions:
o	NegativeAmountException: This exception should be thrown when an attempt is made to deposit or withdraw a negative amount of money.
o	DepositLimitExceededException: This exception should be thrown when an attempt is made to deposit an amount greater than the maximum deposit limit.
o	InsufficientFundsException: This exception should be thrown when an attempt is made to withdraw more money than the account balance.
Your task is to implement the BankAccount class and the custom exceptions, and then write a Java program that demonstrates the use of these classes by creating accounts, depositing and withdrawing money, and handling exceptions appropriately.
Make sure to test your code with various scenarios to ensure that the exception handling works as expected.
Note: You can define the maximum deposit limit and other constants as needed for your implementation.
class NegativeAmountException extends Exception {

    public NegativeAmountException(String message) {
        super(message);
    }
}

class DepositLimitExceededException extends Exception {

    public DepositLimitExceededException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {

    private static final double MAX_DEPOSIT_LIMIT = 10000.0;

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) throws NegativeAmountException, DepositLimitExceededException {
        if (amount <= 0) {
            throw new NegativeAmountException("Deposit amount must be positive");
        }
        if (amount > MAX_DEPOSIT_LIMIT) {
            throw new DepositLimitExceededException("Deposit limit exceeded. Max deposit limit is $" + MAX_DEPOSIT_LIMIT);
        }
        balance += amount;
    }

    public void withdraw(double amount) throws NegativeAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new NegativeAmountException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Mavenproject1 {

    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount("123456789", "John Doe", 5000.0);

        try {
            // Deposit some money
            account.deposit(2000.0);
            System.out.println("New balance after deposit: $" + account.getBalance());

            // Withdraw some money
            account.withdraw(3000.0);
            System.out.println("New balance after withdrawal: $" + account.getBalance());

            // Attempt to deposit a negative amount
            account.deposit(-100.0);
        } catch (NegativeAmountException | DepositLimitExceededException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}




Question 3: Design a Java program for a library management system. Implement a LibraryItem class with attributes like title, author, and isCheckedOut. Create two subclasses: Book and DVD. Implement a custom exception hierarchy for this system. Define a LibraryException as the base exception and create two child exceptions: ItemNotFoundException and ItemAlreadyCheckedOutException. Implement exception handling to check for these exceptions when a user attempts to check out an item that doesn't exist or is already checked out.

// Base exception for the library management system
package com.mycompany.mavenproject1;

class LibraryException extends Exception {
    public LibraryException(String message) {
        super(message);
    }
}

// Custom exception for item not found
class ItemNotFoundException extends LibraryException {
    public ItemNotFoundException(String message) {
        super(message);
    }
}

// Custom exception for item already checked out
class ItemAlreadyCheckedOutException extends LibraryException {
    public ItemAlreadyCheckedOutException(String message) {
        super(message);
    }
}

// Base class for library items
class LibraryItem {
    private String title;
    private String author;
    private boolean isCheckedOut;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkOut() {
        isCheckedOut = true;
    }

    public void checkIn() {
        isCheckedOut = false;
    }
}

// Subclass for books
class Book extends LibraryItem {
    public Book(String title, String author) {
        super(title, author);
    }
}

// Subclass for DVDs
class DVD extends LibraryItem {
    public DVD(String title, String author) {
        super(title, author);
    }
}

// Library class to manage items
class Library {
    private LibraryItem[] items;

    public Library(int capacity) {
        items = new LibraryItem[capacity];
    }

    public void addItem(LibraryItem item, int index) {
        items[index] = item;
    }

    public LibraryItem getItem(int index) throws ItemNotFoundException {
        if (index < 0 || index >= items.length || items[index] == null) {
            throw new ItemNotFoundException("Item not found in the library.");
        }
        return items[index];
    }

    public void checkOutItem(int index) throws ItemNotFoundException, ItemAlreadyCheckedOutException {
        LibraryItem item = getItem(index);

        if (item.isCheckedOut()) {
            throw new ItemAlreadyCheckedOutException("Item is already checked out.");
        }

        item.checkOut();
    }

    public void checkInItem(int index) throws ItemNotFoundException {
        LibraryItem item = getItem(index);
        item.checkIn();
    }
}

public class Mavenproject1{
    public static void main(String[] args) {
        Library library = new Library(5);

        LibraryItem book1 = new Book("Book 1", "Author 1");
        LibraryItem book2 = new Book("Book 2", "Author 2");
        LibraryItem dvd1 = new DVD("DVD 1", "Director 1");

        library.addItem(book1, 0);
        library.addItem(book2, 1);
        library.addItem(dvd1, 2);

        try {
            library.checkOutItem(0);
            library.checkOutItem(1);
            library.checkOutItem(0); // This should throw ItemAlreadyCheckedOutException
        } catch (ItemNotFoundException | ItemAlreadyCheckedOutException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            library.checkInItem(1);
            library.checkInItem(3); // This should throw ItemNotFoundException
        } catch (ItemNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

Additional Problems:

Go through textbook: Already solved problems in Chapter 12 and exercise problems 12.1, 12.2, 12.3, 12.4, 12.5 and 12.6

 */

import java.util.*;
class InvalidOperatorException extends Exception
{
    public  InvalidOperatorException(String msg)
    {
        super(msg);
    }
}
public class MoodleException
{
    public static void main(String [] args)
    {
        
        try
        {
            Scanner sc=new Scanner(System.in);
        String num1=sc.next();
        String num2=sc.next();
        String op=sc.next();
        if(op!="+"||op!="-"||op!="*"||op!="/")
        {
            throw new InvalidOperatorException(" give valid operator ");
        }
        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        int res=0;
        switch(op)
        {
            case "+":
               res=n1+n2;
               break;
            case "-":
               res=n1-n2;
               break;
            case "*":
               res=n1*n2;
               break;
            case "/":
            if(n2==0)
            {
                throw new ArithematicException(" divison by zero not defined");
            }
                res=n1/n2;
                break;

             
        }
        System.out.println(" res of num1 and num2 is "+n1+" "+op+" "+n2+" = "+res);

        

        

    }
    catch(ArithematicException obj )
    {
        System.out.println(obj.getMessage());
    }
}
