import java.util.ArrayList;

public class SavingsAccount extends BankAccount {
    private double interest_rate;

    private SavingsAccount(int account_number, String account_name, double balance, ArrayList<Transactions> transactions, double interest_rate) {
        super(account_number, account_name, balance, transactions);
        this.interest_rate = interest_rate;
    }

    private double getInterest_rate() {
        return interest_rate;
    }

    private void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }
}
