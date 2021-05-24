/**
 * Class Account that has the client's account specifications
 *
 * @author Mirette Amin Danial
 * ID: 20190570
 * created on 17/4/2021
 */

public class Account {

    protected static long accountCounter;
    protected long accountNumber;
    protected double balance;

    /**
     * Default Constructor that sets balance to initial value which is 0
     * and increments count variable to assign value to account number automatically in case the the account number wasn't specified
     */
    Account() {
        balance = 0.0;
        accountCounter++;
        accountNumber = accountCounter;
    }

    /**
     * Parameterized Constructor that takes one parameter in case the user want to input only the balance
     *
     * @param balanceValue
     */
    Account(double balanceValue) {
        balance = balanceValue;
        accountCounter++;
        accountNumber = accountCounter;
    }

    /**
     * Balance Getter
     *
     * @return balance value
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Balance Setter
     *
     * @param balanceValue
     */
    public void setBalance(double balanceValue) {
        balance = balanceValue;
    }

    /**
     * Account Number Getter
     *
     * @return the account number
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Account Number Setter
     *
     * @param accNb
     */
    public void setAccountNumber(long accNb) {
        accountNumber = accNb;
    }

    /**
     * Function that decreases amount of money from the balance
     *
     * @param amount
     */
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Current balance: " + getBalance());
        } else {
            System.out.println("Can't withdraw as this amount of money exceeds your balance value\nCurrent balance: " + getBalance());
        }
    }

    /**
     * Function that adds amount of money to the balance
     *
     * @param amount
     */
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Current balance: " + getBalance());
    }

    /**
     * Function that displays account specifications
     *
     * @return string contains account number and balance
     */
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + "\nBalance: " + balance;
    }
}