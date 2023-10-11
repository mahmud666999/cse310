import java.util.ArrayList;

public class CheckingAccount extends BankAccount{
    private double overdraft_limit;

    private CheckingAccount(int account_number, String account_name, double balance, ArrayList<Transactions> transactions, double overdraft_limit) {
        super(account_number, account_name, balance, transactions);
        this.overdraft_limit = overdraft_limit;
    }

    private double getOverdraft_limit() {
        return overdraft_limit;
    }

    private void setOverdraft_limit(double overdraft_limit) {
        this.overdraft_limit = overdraft_limit;
    }
}
