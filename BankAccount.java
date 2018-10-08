import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * number: string containg account number
 * holders - list of all account holders, can be extended by addAccountHolder method
 * account type: enum with to possible values CHECKING and SAVINGS
 * currentBalance: it's a BigDecimal class for balance, we use BigDecimal as it's a type designated to hold fixed precision numbers
 * that ideally fit for currencies
 */
public class BankAccount {
    private final String number;
    private final List<String> holders = new ArrayList<>();
    private final AccoutType type;
    private BigDecimal currentBalance;

    public BankAccount(String number, AccoutType type, BigDecimal currentBalance, String firstHolderName) {
        this.number = number;
        this.type = type;
        this.currentBalance = currentBalance;
        this.holders.add(firstHolderName);
    }

    public String getNumber() {
        return number;
    }

    public List<String> getHolders() {
        return holders;
    }

    public AccoutType getType() {
        return type;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number='" + getNumber() + '\'' +
                ", holders=" + getHolders() +
                ", type=" + getType() +
                ", currentBalance=" + getCurrentBalance() +
                '}';
    }

    public void makeDeposit(BigDecimal amount) {
        currentBalance = currentBalance.add(amount);
    }

    public void makeWithdraw(BigDecimal amount) {
        if (currentBalance.add(amount.negate()).compareTo(BigDecimal.ZERO) == 1) {
            currentBalance = currentBalance.add(amount.negate());
        } else {
            System.out.println("You cannot perform operation as withdraw amount $" + amount + " is greater than current balance $" + currentBalance);
        }
    }

    public void addAccountHolder(String holder) {
        holders.add(holder);
    }

    public static void main(String[] args) {
        //create new account
        BankAccount bankAccount = new BankAccount("12345678", AccoutType.CHECKING, new BigDecimal(1000), " Gregory House");
        //display current acount state
        System.out.println(bankAccount);
        //make deposit $100 that winned from Willson
        bankAccount.makeDeposit(new BigDecimal(100));
        //display update balance
        System.out.println("Updated account Balance $"+ bankAccount.getCurrentBalance());
        //try to perform withdraw $2500, operation will be aborted because too small account balance
        bankAccount.makeWithdraw(new BigDecimal(2500));
        //display balance
        System.out.println("Balance after try to withdraw $2500 is $" + bankAccount.getCurrentBalance());
    }
}

enum AccoutType {
    SAVINGS,
    CHECKING
}