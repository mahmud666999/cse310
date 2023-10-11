import java.time.LocalDateTime;
import java.util.Date;

public class Transactions {
    private LocalDateTime date;
    private String type;
    private double amount;
    private double balance;

    public Transactions(LocalDateTime date, String type, double amount, double balance) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.balance = balance;
    }

    private LocalDateTime getDate() {
        return date;
    }

    private void setDate() {
        this.date = LocalDateTime.now();
    }

    private String getDeposit() {
        return type;
    }

    private void setDeposit(String type) {
        this.type = type;
    }

    private double getAmount() {
        return amount;
    }

    private void setAmount(int amount) {
        this.amount = amount;
    }

    private double getBalance() {
        return balance;
    }

    private void setBalance(int balance) {
        this.balance = balance;
    }
}
