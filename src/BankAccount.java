import java.time.LocalDateTime;
import java.util.ArrayList;

public class BankAccount {

    private int account_number;
    private String account_name;
    private double balance;
    private ArrayList <Transactions> transactions;

    public BankAccount(int account_number,String account_name, double balance,ArrayList<Transactions> transactions) {
        this.account_number = account_number;
        this.account_name = account_name;
        this.balance = balance;
        this.transactions=transactions;
    }

    public static BankAccount createAccount(int account_number, String account_name){
        return new BankAccount(
                account_number,
                account_name,
                0,
                null);
    }

    public void deposit(double amount){
        balance=balance+amount;
        transactions.add(new Transactions(LocalDateTime.now(),
                "Deposit",
                amount,
                balance));
    }

    public void withdraw(double amount){
        balance=balance+amount;
        transactions.add(new Transactions(LocalDateTime.now(),
                "Withdraw",
                amount,
                balance));
    }

    public void printStatement(){
        System.out.println(transactions);
    }




    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public ArrayList<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transactions> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "account_number=" + account_number +
                ", account_name='" + account_name + '\'' +
                ", balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }
}
