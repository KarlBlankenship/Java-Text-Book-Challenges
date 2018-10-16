/*
 * Add a copy constructor to the BankAccount class. This constructor
 * should accept a BankAccount object as an argument. It should assign
 * to the balance field the value in the arguments balance field. As a
 * result, the new object will be a copy of the argument object.
 */
package java_text.chapter_8.challenge_2;

/**
 * The BankAccount class simulates a bank account.
 * @author Karl
 */
public class BankAccount {
    private double balance;     // Account balance.
    
    
    /**
     * Constructor. Sets the starting balance.
     */
    public BankAccount()
    {
        balance = 0.0;
    }
    
    /**
     * This constructor set the starting balance
     * to the value passed as an argument.
     * @param startBalance The starting balance.
     */
    public BankAccount(double startBalance)
    {
        balance = startBalance;
    }
    
    /**
     * This constructor sets the starting balance
     * to the value passed in the String argument.
     * @param str The starting balance as a String.
     */
    public BankAccount(String str)
    {
        balance = Double.parseDouble(str);
    }
    
    //// New contructor added for Chap 8 Chal 2. ////
    /**
     * This constructor makes a copy of the BankAccount object
     * that is provided as the argument.
     * @param ba BankAccount object that needs to be copied. 
     */
    public BankAccount(BankAccount ba)
    {
        balance = ba.getBalance();
    }
    
    /**
     * The deposit method makes a deposit into the account.
     * @param amount The amount to add to the balance field.
     */
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    /**
     * This deposit method makes a deposit into the account.
     * @param str The amount to add to the balance field, as a String.
     */
    public void deposit(String str)
    {
        balance += Double.parseDouble(str);
    }
    
    /**
     * The withdraw method withdraws as amount
     * from the account.
     * @param amount The amount to subtract from the balance field.
     */
    public void withdraw(double amount)
    {
        balance -= amount;
    }
    
    /**
     * The withdraw method withdraws as amount
     * from the account.
     * @param str The amount to subtract from the 
     *              balance field, as a String.
     */
    public void withdraw(String str)
    {
        balance -= Double.parseDouble(str);
    }
    
    /**
     * The setBalance method sets the account balance.
     * @param b The value to store in the balance field.
     */
    public void setBalance(double b)
    {
        balance = b;
    }
    
    /**
     * The setBalance method sets the account balance.
     * @param str The value to store in the balance field.
     */
    public void setBalance(String str)
    {
        balance = Double.parseDouble(str);
    }
    
    /**
     * The getBalance method returns the account balance.
     * @return The value in the balance field.
     */
    public double getBalance()
    {
        return balance;
    }
}