/**
 * Class SpecialAccount that inherits from class Account
 * It has a special quality that the client can withdraw money after up to 1000 after the balance becomes empty
 *
 * @author Mirette Amin Danial
 * ID: 20190570
 * Date: 17/4/2021
 */

public class SpecialAccount extends Account {

    /**
     * Default Constructor that sets balance to initial value which is 0
     * and increments count variable to assign value to account number automatically in case the the account number wasn't specified
     */
    SpecialAccount() {
        super();
    }

    /**
     * Parameterized Constructor that takes one parameter in case the user want to input only the balance
     *
     * @param balanceValue
     */
    SpecialAccount(double balanceValue) {
        super(balanceValue);
    }

    /**
     * Overriding the parent's function
     *
     * @param amount of money to be decreased from balance
     */
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -1000) {
            balance -= amount;
            System.out.println("Current balance: " + getBalance());
        } else {
            System.out.println("Can't withdraw, you've reached your limit (-1000)\nCurrent balance: " + getBalance());
        }
    }
}
