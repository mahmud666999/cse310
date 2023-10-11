import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CheckingAccount a1=
                new CheckingAccount(
                        2,
                        "mahmud",
                        1000,
                        new ArrayList<Transactions>(),
                        10000
                );

        a1.deposit(1000);
        a1.withdraw(500);
        System.out.println(a1.getTransactions());
        System.out.println(a1);

        SavingsAccount a2=new SavingsAccount(
                2,
                "hassan",
                3000,
                new ArrayList<Transactions>(),
                10);

        a2.deposit(1000);
        a2.withdraw(500);
        System.out.println(a2.getTransactions());
        System.out.println(a2);



    }


}