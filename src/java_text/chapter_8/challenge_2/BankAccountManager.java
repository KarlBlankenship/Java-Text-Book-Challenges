/*
 * This program is written to test the new constructor in Chap 8 Chal 2.
 */
package java_text.chapter_8.challenge_2;

/**
 * This program is written to test the new constructor in Chap 8 Chal 2.
 * @author Karl
 */
public class BankAccountManager 
{
    /**
     * The main method will execute the program.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Create a new BankAccount object using default Constructor.
        BankAccount bank1 = new BankAccount();
        
        // Add some money to it.
        bank1.deposit(235.97);
        
        // Display the balance to verify it was created and has money in it.
        System.out.println("Original Bank Account Balance: " +
                                bank1.getBalance());
        
        // Now create a new bank account object using the first BankAccount
        // instance as the input argument.
        BankAccount bank2 = new BankAccount(bank1);
        
        // Now display the new bank account balance to verify that the
        // new bank account is a copy of the first.
        System.out.println("New Bank Account Balance: " +
                                bank2.getBalance());
    }
}
